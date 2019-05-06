package com.attractions.control;

import com.attractions.dao.AdminInfoDao;
import com.attractions.dao.UserInfoDao;
import com.attractions.moudle.AdminInfo;
import com.attractions.moudle.UserInfo;
import com.attractions.server.AdminNameToChexkIsLogin;
import com.attractions.server.UserNameToChexkIsLogin;
import com.attractions.server.UserRegister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Admin {

    @CrossOrigin
    @RequestMapping(value = "/checkIsAdminLogin", produces = "application/json;charset=UTF-8")
    /**
     * 跟据用户名密码判断是否登录
     * @return
     */
    public boolean adminNameTocheckIsLogin(@RequestBody AdminNameToChexkIsLogin result) {
        AdminInfoDao adminInfoDao = new AdminInfoDao();
        String adminName = result.getAdminName();
        String adminPassword = result.getAdminPassword();
        String sql = "select * from admininfo where admin_name = '" + adminName + "'";
        ArrayList<AdminInfo> arr = adminInfoDao.queryInfo(sql);
        adminInfoDao.closeCon();
        AdminInfo admin = arr.get(0);
        if(admin.getAdminPassword().equals(adminPassword)){
            return true;
        }
        return false;
    }
}
