package com.attractions.dao;

import java.sql.*;

public class BaseDao {
    private DbUtil dbUtil = new DbUtil();

    /**
     * 关闭数据库连接,释放资源
     */
    public void closeCon(){
        dbUtil.closeCon();
    }

    /**
     * 基础查询
     */
    public ResultSet query(String sql){
        try{
            PreparedStatement preparedStatement = dbUtil.getConnection().prepareStatement(sql);
            return preparedStatement.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 改变数据库类容的操作
     */
    public boolean update(String sql){
        try{
            return dbUtil.getConnection().prepareStatement(sql).executeUpdate() > 0;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 建立连接
     */
    public Connection getConnection(){
       return dbUtil.getConnection();
    }
}

