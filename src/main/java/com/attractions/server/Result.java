package com.attractions.server;

/**
 * 处理接收数据的实体类
 *
 * @auther leidian
 * @date 2019/04/18
 */
public class Result {

    /**
     * 城市名
     */
    private String cityName;
    /**
     * 景点类型
     */
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
