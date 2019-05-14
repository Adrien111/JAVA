package com.attractions.moudle;

/**
 * 用户信息实体类
 *
 * @auther leidian
 * @date 2019/04/23
 */
public class UserInfo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户登陆密码
     */
    private String userPassword;
    /**
     * 用户账号创建时间
     */
    private String userCreateDate;
    /**
     * 用户所在城市
     */
    private String userCity;
    /**
     * 用户头像
     */
    private String avatarImage;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public String getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(String userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(String avatrImage) {
        this.avatarImage = avatrImage;
    }
}
