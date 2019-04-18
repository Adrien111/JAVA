package com.example.demo;


import com.attractions.dao.DbUtil;
import com.attractions.dao.ScenicspotInfoDao;
import com.attractions.server.Result;
import com.attractions.server.ScenicspotInfo;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Control {

    @CrossOrigin
    @RequestMapping(value = "/hello", produces = "application/json;charset=UTF-8")
    public ArrayList<ScenicspotInfo> queryInfo(@RequestBody Result result) {
        try {
            ScenicspotInfoDao scenicspotInfoDao = new ScenicspotInfoDao();
            ArrayList<ScenicspotInfo> arr = new ArrayList<>();
            String cityName = result.getCityName();
            String sql = "";
            String type = result.getType();
            if(type.equals("")){
                sql = "select DISTINCT * from scenicspot_info where city = '" + cityName + "' LIMIT 0 ,30;";
            }else{
                sql = "select DISTINCT * from scenicspot_info where city = '" + cityName + "' and type = '"+type+"' LIMIT 0 ,30;";
            }

            ResultSet resultSet = scenicspotInfoDao.queryInfo(sql);
            while (resultSet.next()) {
                ScenicspotInfo scenicspotInfo = new ScenicspotInfo();
                scenicspotInfo.setName(resultSet.getString("name"));
                scenicspotInfo.setLevel(resultSet.getString("level"));
                scenicspotInfo.setImgUrl(resultSet.getString("image_url"));
                scenicspotInfo.setPrice(resultSet.getInt("price"));
                scenicspotInfo.setInfo(resultSet.getString("intro"));
                scenicspotInfo.setArea(resultSet.getString("area"));
                arr.add(scenicspotInfo);
            }
            return arr;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/test")
    public String test (){
        return "hello";
    }
}