/*
 * Do not remove this unless you get business authorization.
 * Copyright (c) 2016 - 2018 All Rights Reserved.
 * Powered By [stategen.dalgen]
 */
package ${packageName}.domain;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;

import org.stategen.framework.lite.IMenu;
import org.stategen.framework.lite.TreeNode;
import org.stategen.framework.lite.enums.MenuType;
import org.stategen.framework.lite.enums.VisitCheckType;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * Menu
 * <pre>
 * database table: menu
 * database table comments: Menu
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅不可以修改dalgen生成的属生(field)类型 ,方法(Method)返回值类型和参数类型
 * 不建议使@Data,其hashCode有问题
 * </pre>
 */
@Getter
@Setter
public class Menu extends TreeNode<Menu> implements java.io.Serializable, IMenu<Menu> {

    private String roleId;

    private Boolean checked;

    private static final long serialVersionUID = -5216457518046898601L;

    /***menuId   db_column: menu_id BIGINT */
    @ApiModelProperty("menuId")
    @Id
    private Long menuId;

    /***morder   db_column: morder INTEGER */
    @ApiModelProperty("morder")
    private Integer morder;

    /***menuId与bpid组成树图   db_column: bpid BIGINT */
    @ApiModelProperty("menuId与bpid组成树图")
    private Long bpid;

    /***大部分情况下与bpid相同，当为动态目录时，mpid=-1   db_column: mpid BIGINT */
    @ApiModelProperty("大部分情况下与bpid相同，当为动态目录时，mpid=-1")
    private Long mpid;

    /***对应的项目id   db_column: project_name VARCHAR */
    @ApiModelProperty("对应的项目id")
    @Max(64)
    private String projectName;

    /***对应后台系统controlle名称   db_column: controller_name VARCHAR */
    @ApiModelProperty("对应后台系统controlle名称")
    @Max(64)
    private String controllerName;

    /***对应后台系统method名称   db_column: method_name VARCHAR */
    @ApiModelProperty("对应后台系统method名称")
    @Max(64)
    private String methodName;

    /***对应的api路径   db_column: url VARCHAR */
    @ApiModelProperty("对应的api路径")
    @Max(64)
    private String url;

    /***icon   db_column: icon VARCHAR */
    @ApiModelProperty("icon")
    @Max(64)
    private String icon;

    /***name   db_column: name VARCHAR */
    @ApiModelProperty("name")
    @Max(64)
    private String name;

    /***route   db_column: route VARCHAR */
    @ApiModelProperty("route")
    @Max(64)
    private String route;

    /***menuType   db_column: menu_type VARCHAR */
    @ApiModelProperty("menuType")
    private MenuType menuType;

    /***checkType   db_column: check_type VARCHAR */
    @ApiModelProperty("checkType")
    private VisitCheckType checkType;

    /***数据创建时间   db_column: create_time TIMESTAMP */
    @ApiModelProperty(value = "数据创建时间", hidden = true)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createTime;

    /***数据更新时间   db_column: update_time TIMESTAMP */
    @ApiModelProperty(value = "数据更新时间", hidden = true)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updateTime;

    /***是否删除(0:正常，1删除)   db_column: delete_flag INTEGER */
    @ApiModelProperty(value = "是否删除(0:正常，1删除)", hidden = true)
    private Integer deleteFlag;

    /*----------------getter & setter ignore by lombok -------------------*/
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd H:m:ss.SSS");
        StringBuffer sb = new StringBuffer(1024);
        sb.append('{');
        sb.append("menuIds=").append(menuIds).append('\n');
        sb.append("morderMin=").append(morderMin).append('\n');
        sb.append("morderMax=").append(morderMax).append('\n');
        sb.append("bpids=").append(bpids).append('\n');
        sb.append("mpids=").append(mpids).append('\n');
        sb.append("projectNameLike=").append(projectNameLike).append('\n');
        sb.append("controllerNameLike=").append(controllerNameLike).append('\n');
        sb.append("methodNameLike=").append(methodNameLike).append('\n');
        sb.append("nameLike=").append(nameLike).append('\n');
        sb.append("routeLike=").append(routeLike).append('\n');
        sb.append("menuTypes=").append(menuTypes).append('\n');
        sb.append("checkTypes=").append(checkTypes).append('\n');
        sb.append("createTimeMin=").append(createTimeMin != null ? df.format(createTimeMin) : null).append('\n');
        sb.append("createTimeMax=").append(createTimeMax != null ? df.format(createTimeMax) : null).append('\n');
        sb.append("updateTimeMin=").append(updateTimeMin != null ? df.format(updateTimeMin) : null).append('\n');
        sb.append("updateTimeMax=").append(updateTimeMax != null ? df.format(updateTimeMax) : null).append('\n');
        sb.append("menuId=").append(menuId).append('\n');
        sb.append("morder=").append(morder).append('\n');
        sb.append("bpid=").append(bpid).append('\n');
        sb.append("mpid=").append(mpid).append('\n');
        sb.append("projectName=").append(projectName).append('\n');
        sb.append("controllerName=").append(controllerName).append('\n');
        sb.append("methodName=").append(methodName).append('\n');
        sb.append("url=").append(url).append('\n');
        sb.append("icon=").append(icon).append('\n');
        sb.append("name=").append(name).append('\n');
        sb.append("route=").append(route).append('\n');
        sb.append("menuType=").append(menuType).append('\n');
        sb.append("checkType=").append(checkType).append('\n');
        sb.append("createTime=").append(createTime != null ? df.format(createTime) : null).append('\n');
        sb.append("updateTime=").append(updateTime != null ? df.format(updateTime) : null).append('\n');
        sb.append("deleteFlag=").append(deleteFlag);
        sb.append('}');
        return sb.toString();
    }

    /*** menuIds in getMenuPageList */
    @ApiModelProperty("menuId s")
    @JSONField(serialize = false)
    private java.util.List<Long> menuIds;

    /*** morderMin in getMenuPageList */
    @ApiModelProperty("morderMin")
    @JSONField(serialize = false)
    private Integer morderMin;

    /*** morderMax in getMenuPageList */
    @ApiModelProperty("morderMax")
    @JSONField(serialize = false)
    private Integer morderMax;

    /*** menuId与bpid组成树图s in getMenuPageList */
    @ApiModelProperty("menuId与bpid组成树图 s")
    @JSONField(serialize = false)
    private java.util.List<Long> bpids;

    /*** 大部分情况下与bpid相同，当为动态目录时，mpid=-1s in getMenuPageList */
    @ApiModelProperty("大部分情况下与bpid相同 s")
    @JSONField(serialize = false)
    private java.util.List<Long> mpids;

    /*** 对应的项目idLike in getMenuPageList */
    @ApiModelProperty("对应的项目idLike")
    @JSONField(serialize = false)
    private String projectNameLike;

    /*** 对应后台系统controlle名称Like in getMenuPageList */
    @ApiModelProperty("对应后台系统controlle名称Like")
    @JSONField(serialize = false)
    private String controllerNameLike;

    /*** 对应后台系统method名称Like in getMenuPageList */
    @ApiModelProperty("对应后台系统method名称Like")
    @JSONField(serialize = false)
    private String methodNameLike;

    /*** 对应的项目idnameLike in getMenuPageList */
    @ApiModelProperty("对应的项目idnameLike")
    @JSONField(serialize = false)
    private String nameLike;

    /*** routeLike in getMenuPageList */
    @ApiModelProperty("routeLike")
    @JSONField(serialize = false)
    private String routeLike;

    /*** menuTypes in getMenuPageList */
    @ApiModelProperty("menuType s")
    @JSONField(serialize = false)
    private java.util.List<org.stategen.framework.lite.enums.MenuType> menuTypes;

    /*** checkTypes in getMenuPageList */
    @ApiModelProperty("checkType s")
    @JSONField(serialize = false)
    private java.util.List<org.stategen.framework.lite.enums.VisitCheckType> checkTypes;

    /*** 数据创建时间Min in getMenuPageList */
    @ApiModelProperty("数据创建时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    @JSONField(serialize = false)
    private java.util.Date createTimeMin;

    /*** 数据创建时间Max in getMenuPageList */
    @ApiModelProperty("数据创建时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    @JSONField(serialize = false)
    private java.util.Date createTimeMax;

    /*** 数据更新时间Min in getMenuPageList */
    @ApiModelProperty("数据更新时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    @JSONField(serialize = false)
    private java.util.Date updateTimeMin;

    /*** 数据更新时间Max in getMenuPageList */
    @ApiModelProperty("数据更新时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    @JSONField(serialize = false)
    private java.util.Date updateTimeMax;

    /**
     * Getter method for property <tt>id id</tt>.
     * @return property value of id id
     */
    @ApiModelProperty("id,和MenuId相同，为了生成树")
    public Long getId() {
        return getMenuId();
    }

    public List<Menu> getMenuChildren() {
        return super.getChildren();
    }

    @ApiModelProperty(value = "打开顺序，前端model存储用", hidden = true)
    public Integer getOpendOrder() {
        return null;
    }
}
