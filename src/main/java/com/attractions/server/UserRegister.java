package com.attractions.server;

/**
 * 接受用户注册时的参数
 *
 * @auther leidian
 * @date 2019/04/26
 */
public class UserRegister {
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
