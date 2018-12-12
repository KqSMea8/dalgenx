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
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import ${packageName}.enums.RoleType;
import io.swagger.annotations.ApiModelProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * User
 * <pre>
 * database table: user
 * database table comments: User
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * 该类仅不可以修改dalgen生成的属生(field)类型 ,方法(Method)返回值类型和参数类型
 * 不建议使@Data,其hashCode有问题
 * </pre>
 */
@Getter
@Setter
public class User implements java.io.Serializable {

    @ApiModelProperty("用户可访问的节点")
    private List<Long> visitsIds;

    private static final long serialVersionUID = -5216457518046898601L;

    /***用户ID   db_column: user_id VARCHAR */
    @ApiModelProperty("用户ID")
    @Id
    @Max(64)
    private String userId;

    /***用户名   db_column: username VARCHAR */
    @ApiModelProperty("用户名")
    @Max(64)
    private String username;

    /***密码，测试，明文   db_column: password VARCHAR */
    @ApiModelProperty("密码，测试，明文")
    @Max(64)
    private String password;

    /***用户角色 ADMIN,DEFAULT,DEVELOPER   db_column: role_type VARCHAR */
    @ApiModelProperty("用户角色 ADMIN,DEFAULT,DEVELOPER")
    private RoleType roleType;

    /***name   db_column: name VARCHAR */
    @ApiModelProperty("name")
    @Max(64)
    private String name;

    /***nickName   db_column: nickName VARCHAR */
    @ApiModelProperty("nickName")
    @Max(32)
    private String nickName;

    /***age   db_column: age INTEGER */
    @ApiModelProperty("age")
    private Integer age;

    /***address   db_column: address VARCHAR */
    @ApiModelProperty("address")
    @Max(255)
    private String address;

    /***isMale   db_column: isMale BIT */
    @ApiModelProperty("isMale")
    private Boolean isMale;

    /***avatar   db_column: avatar VARCHAR */
    @ApiModelProperty("avatar")
    @Max(255)
    private String avatar;

    /***邮箱   db_column: email VARCHAR */
    @ApiModelProperty("邮箱")
    @NotNull
    @Email
    @Max(128)
    private String email;

    /***创建时间   db_column: create_time TIMESTAMP */
    @ApiModelProperty("创建时间")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createTime;

    /***更新时间   db_column: update_time TIMESTAMP */
    @ApiModelProperty("更新时间")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updateTime;

    /***是否删除(0:正常，1删除)   db_column: delete_flag INTEGER */
    @ApiModelProperty("是否删除(0:正常，1删除)")
    private Integer deleteFlag;

    /*----------------getter & setter ignore by lombok -------------------*/
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd H:m:ss.SSS");
        StringBuffer sb = new StringBuffer(1024);
        sb.append('{');
        sb.append("userIds=").append(userIds).append('\n');
        sb.append("usernameLike=").append(usernameLike).append('\n');
        sb.append("passwordLike=").append(passwordLike).append('\n');
        sb.append("roleTypes=").append(roleTypes).append('\n');
        sb.append("nameLike=").append(nameLike).append('\n');
        sb.append("nickNameLike=").append(nickNameLike).append('\n');
        sb.append("ageMin=").append(ageMin).append('\n');
        sb.append("ageMax=").append(ageMax).append('\n');
        sb.append("addressLike=").append(addressLike).append('\n');
        sb.append("avatarLike=").append(avatarLike).append('\n');
        sb.append("emailLike=").append(emailLike).append('\n');
        sb.append("createTimeMin=").append(createTimeMin != null ? df.format(createTimeMin) : null).append('\n');
        sb.append("createTimeMax=").append(createTimeMax != null ? df.format(createTimeMax) : null).append('\n');
        sb.append("updateTimeMin=").append(updateTimeMin != null ? df.format(updateTimeMin) : null).append('\n');
        sb.append("updateTimeMax=").append(updateTimeMax != null ? df.format(updateTimeMax) : null).append('\n');
        sb.append("userId=").append(userId).append('\n');
        sb.append("username=").append(username).append('\n');
        sb.append("password=").append(password).append('\n');
        sb.append("roleType=").append(roleType).append('\n');
        sb.append("name=").append(name).append('\n');
        sb.append("nickName=").append(nickName).append('\n');
        sb.append("age=").append(age).append('\n');
        sb.append("address=").append(address).append('\n');
        sb.append("isMale=").append(isMale).append('\n');
        sb.append("avatar=").append(avatar).append('\n');
        sb.append("email=").append(email).append('\n');
        sb.append("createTime=").append(createTime != null ? df.format(createTime) : null).append('\n');
        sb.append("updateTime=").append(updateTime != null ? df.format(updateTime) : null).append('\n');
        sb.append("deleteFlag=").append(deleteFlag);
        sb.append('}');
        return sb.toString();
    }

    /*** 用户IDs in getUserPageListByDefaultQuery */
    @ApiModelProperty("用户IDs")
    private transient java.util.List<String> userIds;

    /*** 用户名Like in getUserPageListByDefaultQuery */
    @ApiModelProperty("用户名Like")
    private transient String usernameLike;

    /*** 密码，测试，明文Like in getUserPageListByDefaultQuery */
    @ApiModelProperty("密码Like")
    private transient String passwordLike;

    /*** 用户角色 ADMIN,DEFAULT,DEVELOPERs in getUserPageListByDefaultQuery */
    @ApiModelProperty("用户角色s")
    private transient java.util.List<${packageName}.enums.RoleType> roleTypes;

    /*** 用户名nameLike in getUserPageListByDefaultQuery */
    @ApiModelProperty("用户名nameLike")
    private transient String nameLike;

    /*** nickNameLike in getUserPageListByDefaultQuery */
    @ApiModelProperty("nickNameLike")
    private transient String nickNameLike;

    /*** ageMin in getUserPageListByDefaultQuery */
    @ApiModelProperty("ageMin")
    private transient Integer ageMin;

    /*** ageMax in getUserPageListByDefaultQuery */
    @ApiModelProperty("ageMax")
    private transient Integer ageMax;

    /*** addressLike in getUserPageListByDefaultQuery */
    @ApiModelProperty("addressLike")
    private transient String addressLike;

    /*** avatarLike in getUserPageListByDefaultQuery */
    @ApiModelProperty("avatarLike")
    private transient String avatarLike;

    /*** 邮箱Like in getUserPageListByDefaultQuery */
    @ApiModelProperty("邮箱Like")
    private transient String emailLike;

    /*** 创建时间Min in getUserPageListByDefaultQuery */
    @ApiModelProperty("创建时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date createTimeMin;

    /*** 创建时间Max in getUserPageListByDefaultQuery */
    @ApiModelProperty("创建时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date createTimeMax;

    /*** 更新时间Min in getUserPageListByDefaultQuery */
    @ApiModelProperty("更新时间Min")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date updateTimeMin;

    /*** 更新时间Max in getUserPageListByDefaultQuery */
    @ApiModelProperty("更新时间Max")
    @Temporal(TemporalType.TIMESTAMP)
    private transient java.util.Date updateTimeMax;

    public List<Long> getVisitsIds() {
        return visitsIds;
    }

    public void setVisitsIds(List<Long> visitsIds) {
        this.visitsIds = visitsIds;
    }
}