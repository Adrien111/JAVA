package com.attractions.dao;

import com.attractions.moudle.CityArea;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CityAreaDao extends BaseDao{
    /**
     * 关于根据城市名对于景点信息表的数据库查询操作
     * @param  sql
     * @return ArrayList
     */
    public ArrayList<CityArea> queryInfo(String sql){
        ArrayList<CityArea> arr = new ArrayList<>();
        try {
            ResultSet resultSet = query(sql);
            while(resultSet.next()){
                CityArea cityArea = new CityArea();
                cityArea.setArea(resultSet.getString("area"));
                arr.add(cityArea);
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
