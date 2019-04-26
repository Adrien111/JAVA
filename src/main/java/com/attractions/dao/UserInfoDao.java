package com.attractions.dao;

import com.attractions.moudle.UserInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 用户信息数据库操作
 *
 * @auther leidian
 * @date 2019/04/26
 */
public class UserInfoDao extends BaseDao {

    /**
     * 处理查询结果
     *
     * @param resultSet
     * @return
     */
    public UserInfo resultManage(ResultSet resultSet) {
        UserInfo userInfo = new UserInfo();
        try {
            userInfo.setUserId(resultSet.getString("user_id"));
            userInfo.setUserName(resultSet.getString("user_name"));
            userInfo.setUserPassword(resultSet.getString("user_password"));
            userInfo.setUserCreateDate(resultSet.getString("user_create_date"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    /**
     * 数据库查询操作
     *
     * @param sql
     * @return
     */
    public ArrayList<UserInfo> queryInfo(String sql) {
        ArrayList<UserInfo> arr = new ArrayList<>();
        try {
            ResultSet resultSet = query(sql);
            while (resultSet.next()) {
                UserInfo userInfo = resultManage(resultSet);
                arr.add(userInfo);
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
