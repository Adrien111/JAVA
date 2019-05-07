package com.attractions.moudle;

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
     * 景点id
     */
    private String id;
    /**
     * 景点所在城市
     */
    private String city;
    /**
     * 景点经度
     */
    private float LONG;
    /**
     * 景点维度
     */
    private float LAT;
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
    /**
     * 景点热度
     */
    private float heat;

    /**
     * 景点地址
     */
    private String address;

    /**
     * 景点类型
     */
    private String type;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public float getHeat() {
        return heat;
    }

    public void setHeat(float heat) {
        this.heat = heat;
    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getLONG() {
        return LONG;
    }

    public void setLONG(float LONG) {
        this.LONG = LONG;
    }

    public float getLAT() {
        return LAT;
    }

    public void setLAT(float LAT) {
        this.LAT = LAT;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}