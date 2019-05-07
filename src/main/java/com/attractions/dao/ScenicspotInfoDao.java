package com.attractions.dao;

import com.attractions.moudle.ScenicspotInfo;

import java.sql.*;
import java.util.ArrayList;

/**
 * 关于操作景点信息表的操作
 *
 * @auther 雷典
 * @date 2019/04/18
 */
public class ScenicspotInfoDao extends BaseDao {
    /**
     * 处理查询数据
     * @param resultSet
     * @return
     */
    public ScenicspotInfo resultManage(ResultSet resultSet){
        ScenicspotInfo scenicspotInfo = new ScenicspotInfo();
        try{
                scenicspotInfo.setName(resultSet.getString("name"));
                scenicspotInfo.setLevel(resultSet.getString("level"));
                scenicspotInfo.setImgUrl(resultSet.getString("image_url"));
                scenicspotInfo.setPrice(resultSet.getInt("price"));
                scenicspotInfo.setInfo(resultSet.getString("intro"));
                scenicspotInfo.setArea(resultSet.getString("area"));
                scenicspotInfo.setHeat(resultSet.getFloat("heat"));
                scenicspotInfo.setAddress(resultSet.getString("address"));
                scenicspotInfo.setId(resultSet.getString("id"));
                scenicspotInfo.setType(resultSet.getString("type"));
                scenicspotInfo.setLAT(resultSet.getFloat("LAT"));
                scenicspotInfo.setLONG(resultSet.getFloat("LONG"));
        }catch(SQLException e){
            e.printStackTrace();
        }
        return scenicspotInfo;
    }
    /**
     * 关于根据城市名对于景点信息表的数据库查询操作
     * @param  sql
     * @return ResultSet
     */
    public ArrayList<ScenicspotInfo> queryInfo(String sql){
        ArrayList<ScenicspotInfo> arr = new ArrayList<>();
        try {
            ResultSet resultSet = query(sql);
            while(resultSet.next()){
                ScenicspotInfo scenicspotInfo = resultManage(resultSet);
                arr.add(scenicspotInfo);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return arr;
    }

    /**
     * 关于景点信息表的数据库更新操作
     * @param  sql
     * @return int
     */
    public boolean UpdateInfo(String sql){
            return update(sql);
    }
}
