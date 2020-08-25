package com.guoguo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

    static SqlSessionFactory factory;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory= builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = factory.openSession();
        return sqlSession;
    }



    public static void commitAndClose(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.commit();
            sqlSession.close();
        }
    }

    public static void rollbackAndClose(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.rollback();
            sqlSession.close();
        }
    }
}
