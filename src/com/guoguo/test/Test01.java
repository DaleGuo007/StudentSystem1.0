package com.guoguo.test;

import com.guoguo.bean.Student;
import com.guoguo.dao.StudentMapper;
import com.guoguo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> allStudent = mapper.findAllStudent();
        for (Student student : allStudent) {
            System.out.println("student = " + student.toString());
        }
        MyBatisUtil.commitAndClose(sqlSession);


    }
}
