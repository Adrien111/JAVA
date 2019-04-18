package com.attractions.server;

/**
 * 关于景点信息的实体类
 *
 * @auther leidian
 * @date 2019/04/17
 */
public class ScenicspotInfo {

    /**
     * /景点名称
      */
    private String name;
    /**
     * 景点级别
     */
    private String level;
    /**
     * 景点图片地址
     */
    private String imgUrl;
    /**
     * 门票价格
     */
    private int price;
    /**
     * 景点信息
     */
    private String info;
    /**
     * 景点所在区域
     */
    private String area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}