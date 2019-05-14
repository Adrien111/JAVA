package com.attractions.server;

/**
 * 处理接收数据的实体类
 *
 * @auther leidian
 * @date 2019/04/18
 */
public class CityToQueryAttractionResult {

    /**
     * 城市名
     */
    private String cityName;

    /**
     * 页码
     */
    private int page;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    /**
     * 每次显示数量
     */
    private int row;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
