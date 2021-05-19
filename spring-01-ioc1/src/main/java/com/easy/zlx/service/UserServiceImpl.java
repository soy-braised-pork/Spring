package com.easy.zlx.service;

import com.easy.zlx.dao.UserDao;
import com.easy.zlx.dao.UserDaoImpl;
import com.easy.zlx.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{


    //Service层调Dao层
//   private UserDao userDao=new UserDaoImpl();
     private UserDao userDao=new UserDaoMysqlImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
