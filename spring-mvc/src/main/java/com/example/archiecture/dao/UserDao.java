package com.example.archiecture.dao;


import com.example.archiecture.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {

    @Autowired  //UserDao里注入 jdbcTemplate
    private JdbcTemplate jdbcTemplate;

    /**
     * 通过id去寻找相应的user记录
     */
    public User findByUserId(int id){
        final User user=new User();
        String sql="SELECT id,name,age FROM t_user WHERE id=?";
        jdbcTemplate.query(sql, new Object[]{id}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setAge(resultSet.getInt(3));
            }
        });
        return user;
    }



    /**
     * 通过name去寻找相应的user记录
     */
    public User findByName(String name){
        final User user=new User();
        String sql="SELECT id,name FROM t_user WHERE name=?";
        jdbcTemplate.query(sql, new Object[]{name}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
            }
        });
        return user;
    }

    /**
     * 传两个参数
     * 通过name,sword寻找相应的user记录
     */
    public User findByNameAndPassword(String name,String password){

        final User user=new User();
        String sql="INSERT INTO t_user (name,age password) VALUS (?,?,?)";
        jdbcTemplate.query(sql, new Object[]{name, password}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
            }
        });
        return user;
    }

    public int insertUser(User user){
        String sql="INSERT INTO t_user(name,age,password) VALUE(?,?,?)";
        return jdbcTemplate.update(sql,user.getName(),user.getAge(),user.getPassword());
    }

    public int updateUser(User user){
        String sql="UPDATE t_user SET name=? WHERE id=?";
        return jdbcTemplate.update(sql,user.getName(),user.getId());
    }




}
