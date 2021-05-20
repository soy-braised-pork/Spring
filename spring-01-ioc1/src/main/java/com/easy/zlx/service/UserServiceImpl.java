package com.easy.zlx.service;

import com.easy.zlx.dao.UserDao;
import com.easy.zlx.dao.UserDaoImpl;
import com.easy.zlx.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{


    //Service层调Dao层
//   private UserDao userDao=new UserDaoImpl();
     private UserDao userDao=new UserDaoImpl();

     private UserDao userDao1;
     //利用set进行动态实现值的注入
     public void setUserDao1(UserDao userDao1) {
         this.userDao1 = userDao1;
     }
    public UserDao getUserDao1() {
        return userDao1;
    }



    @Override
    public void getUser() {
        userDao.getUser();
    }


}
