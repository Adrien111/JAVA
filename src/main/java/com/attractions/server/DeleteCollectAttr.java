package com.attractions.server;

/**
 * 删除景点实体类
 *
 * @auther leidian
 * @date 2019/05/06
 */
public class DeleteCollectAttr {
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
