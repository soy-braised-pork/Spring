package com.example.archiecture.service;

import com.example.archiecture.dao.UserClazzRefDao;
import com.example.archiecture.dao.UserDao;
import com.example.archiecture.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserClazzRefDao userClazzRefDao;

    @Autowired
    private TransactionTemplate txTemple;

    public User findUserByName(String username){
        return userDao.findByName(username);
    }

    public User findUserByNameAndPassword(String username,String password){
        return userDao.findByNameAndPassword(username,password);
    }

    /**
     * 在业务层面控制不重名，不用在数据库改动
     */
    public boolean register(User user){
        //用户重名校验
        User userByName=findUserByName(user.getName()); //先去按用户名查找一个用户
        if (userByName != null && userByName.getName() != null && )
    }
}
