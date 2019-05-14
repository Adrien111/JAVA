package com.attractions.control;

import com.attractions.dao.ScenicspotInfoDao;
import com.attractions.dao.UserCollectDao;
import com.attractions.dao.UserInfoDao;
import com.attractions.moudle.ScenicspotInfo;
import com.attractions.moudle.UserCollect;
import com.attractions.moudle.UserInfo;
import com.attractions.control.*;
import com.attractions.server.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

/**
 *用户操作接口
 *
 * @author leidian
 * @date 2019/05/08
 */
@RestController
public class User {

    /**
     * 跟据用户名密码判断是否登录
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/checkIsLogin", produces = "application/json;charset=UTF-8")
    public UserInfo userNameTocheckIsLogin(@RequestBody UserNameToChexkIsLogin result) {
        UserInfoDao userInfoDao = new UserInfoDao();
        String userName = result.getUserName();
        String userPassword = result.getUserPassword();
        String sql = "select * from userinfo where user_name = '" + userName + "'";
        ArrayList<UserInfo> arr = userInfoDao.queryInfo(sql);
        if (!arr.isEmpty()) {
            UserInfo user = arr.get(0);
            if (user.getUserPassword().equals(userPassword)) {
                return user;
            }
        }
        return null;
    }

    /**
     * 用户注册
     *
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/userregister", produces = "application/json;charset=UTF-8")
    public boolean userRegister(@RequestBody UserRegister result) {
        UserInfoDao userInfoDao = new UserInfoDao();
        String userId = result.getUserId();
        String userName = result.getUserName();
        String userPassword = result.getUserPassword();
        String userCreateDate = result.getUserCreateDate();
        String avatarImage = result.getAcatarImage();
        ArrayList<UserInfo> arr = userInfoDao.queryInfo("select * from userinfo");
        for(UserInfo user : arr){
            if(user.getUserName().equals(userName)){
                return false;
            }
        }
        String sql = "insert into userinfo values('" + userId + "' , '" + userName + "' , '" + userPassword + "' , '" + userCreateDate +"' ,'"+avatarImage+"' );";
        boolean flag = userInfoDao.updateInfo(sql);
        userInfoDao.closeCon();
        return flag;
    }

    /**
     * 获取用户信息
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/getUserinfo", produces = "application/json;charset=UTF-8")
    public UserInfo getUserInfo(@RequestBody UserIdGetUserInfo result){
        UserInfoDao userInfoDao = new UserInfoDao();
        String userId = result.getUserId();
        String sql = "select * from userinfo where user_id = '" + userId + "'";
        ArrayList<UserInfo> arr = userInfoDao.queryInfo(sql);
        userInfoDao.closeCon();
        return arr.get(0);
    }

    /**
     * 获取用户收藏景点信息
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value="/usercollectAttr", produces = "application/json;charset=UTF-8")
    public ArrayList<ScenicspotInfo> userIdGetCollectAttr(@RequestBody UserIdGetCollectAttr result){
        ScenicspotInfoDao scenicspotInfoDao = new ScenicspotInfoDao();
        String userId = result.getUserId();
        int page = result.getPage();
        int row = result.getRow();
        String sql = "SELECT * from scenicspot_info, usercollect where scenicspot_info.id = usercollect.attrId and userId = '"+userId+"' LIMIT "+page*row+","+row+";";
        ArrayList<ScenicspotInfo> arr = scenicspotInfoDao.queryInfo(sql);
        scenicspotInfoDao.closeCon();
        return arr;
    }

    /**
     * 设置用户收藏景点
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value="/usecollect", produces = "application/json;charset=UTF-8")
    public boolean setUserCollect(@RequestBody SetUserCollect result){
        UserCollectDao userCollectDao = new UserCollectDao();
        String userId = result.getUserId();
        String userName = result.getUserName();
        String attrId = result.getAttrId();
        String attrName = result.getAttrName();
        String collectDate = result.getCollectDate();
        String sql = "insert into usercollect values('" + userId + "' , '" + userName + "' , '" + attrId + "' , '" + attrName + "' ,'"+collectDate+"' );";
        boolean flag = userCollectDao.update(sql);
        return flag;
    }

    /**
     * 判断景点是否被当前用户收藏
     * @param result
     * @return
     */
    @CrossOrigin
    @RequestMapping(value="/checkcollect", produces = "application/json;charset=UTF-8")
    public boolean isCollect(@RequestBody CheckIsCollect result ){
        UserCollectDao userCollectDao = new UserCollectDao();
        String userId = result.getUserId();
        String attrId = result.getAttrId();
        String sql = "select * from usercollect where userId = '"+userId+"' and attrId = '"+attrId+"';";
        ArrayList<UserCollect> arr = userCollectDao.queryInfo(sql);
        userCollectDao.closeCon();
        if(arr.size() == 0){
            return false;
        }
        return true;
    }

    @CrossOrigin
    @RequestMapping(value="/deletecollect", produces = "application/json;charset=UTF-8")
    public boolean deleteCollect(@RequestBody DeleteCollectAttr result){
        UserCollectDao userCollectDao = new UserCollectDao();
        String userId = result.getUserId();
        String attrId  =result.getAttrId();
        String sql = "delete from usercollect where userId = '"+userId+"' and attrId = '"+attrId+"'; ";
        boolean flag = userCollectDao.update(sql);
        return flag;
    }
}
