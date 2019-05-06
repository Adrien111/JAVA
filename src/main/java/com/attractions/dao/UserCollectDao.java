package com.attractions.dao;

import com.attractions.moudle.UserCollect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 用户收藏景点信息
 */
public class UserCollectDao extends BaseDao{

    /**
     * 处理查询结果
     *
     * @param resultSet
     * @return
     */
    public UserCollect resultManage(ResultSet resultSet) {
        UserCollect userCollect = new UserCollect();
        try {
            userCollect.setUserId(resultSet.getString("userId"));
            userCollect.setUsername(resultSet.getString("user_name"));
            userCollect.setAttrId(resultSet.getString("attrId"));
            userCollect.setAttrName(resultSet.getString("attr_name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userCollect;
    }

    /**
     * 数据库查询操作
     *
     * @param sql
     * @return
     */
    public ArrayList<UserCollect> queryInfo(String sql) {
        ArrayList<UserCollect> arr = new ArrayList<>();
        try {
            ResultSet resultSet = query(sql);
            while (resultSet.next()) {
                UserCollect userCollect = resultManage(resultSet);
                arr.add(userCollect);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    /**
     * 用户详情表数据更新操作
     *
     * @param sql
     * @return
     */
    public boolean updateInfo(String sql) {
        return update(sql);
    }
}
