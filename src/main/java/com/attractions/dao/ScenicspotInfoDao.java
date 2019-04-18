package com.attractions.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 关于操作景点信息表的操作
 *
 * @auther 雷典
 * @date 2019/04/18
 */
public class ScenicspotInfoDao {

    /**
     * 关于景点信息表的数据库链接操作
     * @param  sql
     * @return preparedStatement
     */
    public PreparedStatement connectDb(String sql){
        DbUtil dbUtil = new DbUtil();
        try{
            PreparedStatement preparedStatement = dbUtil.getConnection().prepareStatement(sql);
            return preparedStatement;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 关于景点信息表的数据库查询操作
     * @param  sql
     * @return ResultSet
     */
    public ResultSet queryInfo(String sql){
        try{
            PreparedStatement preparedStatement = connectDb(sql);
            return preparedStatement.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关于景点信息表的数据库更新操作
     * @param  sql
     * @return int
     */
    public int UpdateInfo(String sql){
        DbUtil dbUtil = new DbUtil();
        try{
            PreparedStatement preparedStatement = connectDb(sql);
            return preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

}
