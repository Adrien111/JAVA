package com.attractions.server;

/**
 * 接收管理员登录时的信息
 *
 * @auther leidian
 * @date 2019/04/26
 */
public class AdminNameToChexkIsLogin {
    /**
     * 管理员用户名
     */
    private String adminName;
    /**
     * 管理员密码
     */
    private String adminPassword;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
