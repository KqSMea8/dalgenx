<#--
    Copyright (C) 2018  niaoge<78493244@qq.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
-->
<@genCopyright api/>
<@genImports api.imports,'../'/>
<@formImports/>
<#list api.imports as imp>
    <#if imp.isEnum>
import {${imp?uncap_first}Options} from '../enums/${imp}';
    </#if>
</#list>

<#list api.functions as fun>
  <#if !fun.genForm || isEmpty(fun.params) >
     <#continue >
  </#if>
  <#list fun.params as f>
    <#if !canDrawParam(f)>
      <#continue>
    </#if>
<@genFieldDescription f ''/>
const ${fun}_${f} = {
  <@genFieldProps fun f "  "/>
};
${fun}_${f}.Editor =
<@genFormFunctions fun f "  "/>

   </#list>
</#list>

export namespace ${api}ApiForms {
  <#list api.functions as fun>
    <#if !fun.genForm || isEmpty(fun.params) >
      <#continue >
  </#if>
  export interface ${api}Api${fun?cap_first}FormItemConfigs extends FormItemConfigs {
    <#list fun.params as param>
      <#if !canDrawParam(param)>
          <#continue>
      </#if>
      <@genFormConfigsInteface fun param "    "/>
    </#list>
  }

  export const get${fun?cap_first}FormItemConfigs = (queryRule: ObjectMap<any> = {}, form?: FormPropsUtils): ${api}Api${fun?cap_first}FormItemConfigs => {
  <#list fun.params as f>
      <#if !canDrawParam(f)>
          <#continue>
      </#if>
  <@genFieldDescription f '    '/>
    ${fun?uncap_first}_${f}.form = form;
    <#assign value=genValueConfigs(f, 'queryRule')>
    const ${fun?uncap_first}_${f}Value =${value};
    ${fun?uncap_first}_${f}.config.initialValue = ${fun?uncap_first}_${f}Value;
    ${fun?uncap_first}_${f}.data = ${fun?uncap_first}_${f}Value;
      </#list>

    return {
    <#list fun.params as f>
      <#if !canDrawParam(f)>
          <#continue>
      </#if>
      ${f?cap_first}: ${fun?uncap_first}_${f},
    </#list>
    }
  }
  </#list>
}