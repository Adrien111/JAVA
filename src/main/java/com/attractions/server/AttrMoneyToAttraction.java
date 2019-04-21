package com.attractions.server;

/**
 * 景点价钱和景点区域的实体类
 *
 * @auther lieidan
 * @date  2019/04/21
 */
public class AttrMoneyToAttraction {

    /**
     * 城市名
     */
    private String cityName;
    /**
     * 景点区域
     */
    private String area;

    /**
     * 最小价钱
     */
    private int minMoney;

    /**
     * 最高价钱
     */
    private int maxMoney;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(int minMoney) {
        this.minMoney = minMoney;
    }

    public int getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(int maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
