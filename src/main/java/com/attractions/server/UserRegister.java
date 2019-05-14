package com.attractions.server;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * 接受用户注册时的参数
 *
 * @authr leidian
 * @date 2019/04/26
 */
public class UserRegister implements Serializable {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户创建时间
     */
    private String userCreateDate;

    private String acatarImage;

    public String getAcatarImage() {
        return acatarImage;
    }

    public void setAcatarImage(String acatarImage) {
        this.acatarImage = acatarImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(String userCreateDate) {
        this.userCreateDate = userCreateDate;
    }
}
