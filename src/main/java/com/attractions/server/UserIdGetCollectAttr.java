package com.attractions.server;

/**
 * 通过用户id获取用户收藏的景点信息
 *
 *
 * @auther leidian
 * @date 2019/05/04
 */
public class UserIdGetCollectAttr {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 页码
     */
    private int page;
    /**
     * 每页显示数量
     */
    private int row;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
