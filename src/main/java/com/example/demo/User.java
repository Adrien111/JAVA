package com.example.demo;

import com.attractions.dao.UserInfoDao;
import com.attractions.moudle.UserInfo;
import com.attractions.server.UserNameToChexkIsLogin;
import com.attractions.server.UserRegister;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class User {


    @CrossOrigin
    @RequestMapping(value = "/checkIsLogin", produces = "application/json;charset=UTF-8")
    /**
     * 跟据用户名密码判断是否登录
     * @return
     */
    public boolean userNameTocheckIsLogin(@RequestBody UserNameToChexkIsLogin result) {
        UserInfoDao userInfoDao = new UserInfoDao();
        String userName = result.getUserName();
        String userPassword = result.getUserPassword();
        String sql = "select * from userinfo where user_name = '" + userName + "'";
        ArrayList<UserInfo> arr = userInfoDao.queryInfo(sql);
        userInfoDao.closeCon();
        UserInfo user = arr.get(0);
        if(user.getUserPassword().equals(userPassword)){
            return true;
        }
        return false;
    }

    @CrossOrigin
    @RequestMapping(value = "/userregister", produces = "application/json;charset=UTF-8")
    public boolean userRegister(@RequestBody UserRegister result){
        UserInfoDao userInfoDao = new UserInfoDao();
        String userId = result.getUserId();
        String userName = result.getUserName();
        String userPassword = result.getUserPassword();
        String userCreateDate = result.getUserCreateDate();
        String sql = "insert into userinfo values('"+userId+"' , '"+userName+"' , '" +userPassword+"' , '" +userCreateDate+"' );";
        boolean flag = userInfoDao.updateInfo(sql);
        userInfoDao.closeCon();
        return flag;
    }
}
