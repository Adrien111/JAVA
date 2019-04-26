package com.attractions.dao;

import com.attractions.moudle.AdminInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 管理员数据操作
 *
 * @auther leidian
 * @date 2019/04/26
 */
public class AdminInfoDao extends  BaseDao{
    /**
     * 处理查询结果
     *
     * @param resultSet
     * @return
     */
    public AdminInfo resultManage(ResultSet resultSet) {
        AdminInfo adminInfo = new AdminInfo();
        try {
            adminInfo.setAdminId(resultSet.getString("admin_id"));
            adminInfo.setAdminName(resultSet.getString("admin_name"));
            adminInfo.setAdminPassword(resultSet.getString("admin_password"));
            adminInfo.setAdminCreateDate(resultSet.getString("admin_create_date"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adminInfo;
    }

    /**
     * 数据库查询操作
     *
     * @param sql
     * @return
     */
    public ArrayList<AdminInfo> queryInfo(String sql) {
        ArrayList<AdminInfo> arr = new ArrayList<>();
        try {
            ResultSet resultSet = query(sql);
            while (resultSet.next()) {
                AdminInfo adminInfo = resultManage(resultSet);
                arr.add(adminInfo);
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
