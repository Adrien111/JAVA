package com.attractions.control;


import com.attractions.dao.CityAreaDao;
import com.attractions.dao.ScenicspotInfoDao;
import com.attractions.moudle.CityArea;
import com.attractions.moudle.ScenicspotInfo;
import com.attractions.server.*;
import org.springframework.web.bind.annotation.*;

import java.lang.String;
import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class Scenicspot {

    /**
     * 根据城市查询景点信息
     *
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/scenicspotInfo", produces = "application/json;charset=UTF-8")
    public ArrayList<ScenicspotInfo> cityToQueryAttraction(@RequestBody CityToQueryAttractionResult result) {
        ScenicspotInfoDao scenicspotInfoDao = new ScenicspotInfoDao();
        String cityName = result.getCityName();
        String sql = "select DISTINCT * from scenicspot_info where city = '" + cityName + "' LIMIT 0 ,30;";
        ArrayList<ScenicspotInfo> arr = scenicspotInfoDao.queryInfo(sql);
        scenicspotInfoDao.closeCon();
        return arr;
    }

    /**
     * 根据景点名查询景点信息
     *
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/nameToAttrInfo", produces = "application/json;charset=UTF-8")
    public ArrayList<ScenicspotInfo> attrNameToQueryAttraction(@RequestBody AttrNameToQueryAttractionResult result) {
        ScenicspotInfoDao scenicspotInfoDao = new ScenicspotInfoDao();
        String attrName = result.getAttrName();
        String sql = "select DISTINCT * from scenicspot_info where name = '" + attrName + "' limit 0 ,1";
        ArrayList<ScenicspotInfo> arr = scenicspotInfoDao.queryInfo(sql);
        scenicspotInfoDao.closeCon();
        return arr;
    }

    /**
     * 根据景点id获取景点信息
     *
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/idToAttrInfo", produces = "application/json;charset=UTF-8")
    public ScenicspotInfo attrIdToQueryAttrinction(@RequestBody AttrIdGetAttrinfo result) {
        ScenicspotInfoDao scenicspotInfoDao = new ScenicspotInfoDao();
        String attrId = result.getId();
        String sql = "select * from scenicspot_info where id = '" + attrId + "' limit 0 ,1";
        ArrayList<ScenicspotInfo> arr = scenicspotInfoDao.queryInfo(sql);
        return arr.get(0);
    }

    /**
     * 根据景点区域和景点价格查询景点信息
     *
     * @param result
     * @return ArrayList
     */
    @CrossOrigin
    @RequestMapping(value = "/attrArr", produces = "application/json;charset=UTF-8")
    public ArrayList<ScenicspotInfo> attrMoneyToAttraction(@RequestBody AttrMoneyToAttraction result) {
        ScenicspotInfoDao scenicspotInfoDao = new ScenicspotInfoDao();
        String cityName = result.getCityName();
        String area = result.getArea();
        int minMoney = result.getMinMoney();
        int maxMoney = result.getMaxMoney();
        String sql = "";
        if (area.equals("") && maxMoney > minMoney) {
            sql = "select DISTINCT * from scenicspot_info where city = '" + cityName + "' and price > " + minMoney + " and price < " + maxMoney + " limit 0 ,30;";
        } else if (area.equals("") && minMoney >= maxMoney) {
            sql = "select DISTINCT * from scenicspot_info where city = '" + cityName + "' and price > " + minMoney + " limit 0 ,30;";
        } else if (!area.equals("") && minMoney >= maxMoney) {
            sql = "select DISTINCT * from scenicspot_info where city = '" + cityName + "' and area = '" + area + "' and price > " + minMoney + " limit 0 ,30;";
        } else {
            sql = "select DISTINCT * from scenicspot_info where city = '" + cityName + "' and area = '" + area + "' and price > " + minMoney + " and price < " + maxMoney + " limit 0 ,30;";
        }
        ArrayList<ScenicspotInfo> arr = scenicspotInfoDao.queryInfo(sql);
        scenicspotInfoDao.closeCon();
        return arr;
    }

    /**
     * 根据城市名查询城市区域列表
     *
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/cityArea", produces = "application/json;charset=UTF-8")
    public ArrayList<CityArea> cityNameToCityArea(@RequestBody CityNameToCityArea result) {
        CityAreaDao cityAreaDao = new CityAreaDao();
        String cityName = result.getCityName();
        String sql = "select DISTINCT area from scenicspot_info where city = '" + cityName + "'";
        ArrayList<CityArea> arr = cityAreaDao.queryInfo(sql);
        cityAreaDao.closeCon();
        return arr;
    }
}