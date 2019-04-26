package com.attractions.server;

/**
 * 接受模糊景点名的实体类
 * @auther leidian
 * @date 2019/04/23
 *
 */
public class AttrNameToDimQuery {
    /**
     * 模糊景点名字符串
     */
    private String dimAttrName;

    public String getDimAttrName() {
        return dimAttrName;
    }

    public void setDimAttrName(String dimAttrName) {
        this.dimAttrName = dimAttrName;
    }
}
