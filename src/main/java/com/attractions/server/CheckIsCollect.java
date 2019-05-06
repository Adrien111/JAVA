package com.attractions.server;

/**
 * 判断是否被收藏
 *
 * @auther leidian
 * @date 2019/05/06
 */
public class CheckIsCollect {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 景点id
     */
    private String attrId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }
}
