package com.zking.test.model;

import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
@ToString
public class User {
    private Integer id;
    @NotBlank(message = "账号不能为空")
    private String userName;
    @NotNull(message = "密码不能为null")
    private String userPwd;

    private String realName;

    private String sex;

    private Date birthday;

    private Date createDatetime;

    private String remark;

    public User(Integer id, String userName, String userPwd, String realName, String sex, Date birthday, Date createDatetime, String remark) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.realName = realName;
        this.sex = sex;
        this.birthday = birthday;
        this.createDatetime = createDatetime;
        this.remark = remark;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}