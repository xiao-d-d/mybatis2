package com.mybatis.mi;

import com.mybatis.mi.entity.User;
import com.mybatis.mi.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
      /*  User user = new User();
        user.setPassword("123456");
        user.setUsername("admin");
        int insert=mapper.insert(user);
        System.out.println(insert);*/
        //User user1 = mapper.selectById(2);
        //System.out.println(user1);

    }
}
