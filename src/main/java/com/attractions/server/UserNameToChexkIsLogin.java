package com.attractions.server;

/**
 * 接受前端用户名和密码参数的实体类
 *
 * @auther leidian
 * @date 2019/04/26
 */
public class UserNameToChexkIsLogin {

    /**
     * 用户名参数
     */
    private String userName;

    /**
     * 密码参数
     */
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
