package com.zlx.mybatis.mapper;

import com.zlx.mybatis.entity.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{


    //以前所有操作都使用sqlSession来执行，现在使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public UserMapperImpl(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }



    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }


    public void setSqlSession(SqlSessionTemplate sqlSession) {
    }
}
