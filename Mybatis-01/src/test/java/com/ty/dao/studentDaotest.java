package com.ty.dao;

import com.ty.pojo.Student;
import com.ty.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class studentDaotest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlsession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        List<Student> studentList = studentMapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void getStudentById(){
        SqlSession sqlsession = MyBatisUtils.getSqlsession();
        studentMapper mapper = sqlsession.getMapper(studentMapper.class);
        Student studentById = mapper.getStudentById(1);
        System.out.println(studentById);

        sqlsession.close();
    }

    @Test
    public void addStudent(){
        SqlSession sqlsession = MyBatisUtils.getSqlsession();
        studentMapper mapper = sqlsession.getMapper(studentMapper.class);
        Student student = new Student(3,"tt","7777777");
        mapper.addStudent(student);
        //提交事务：
        sqlsession.commit();
        sqlsession.close();
    }
    @Test
    public void updateStudent(){
        SqlSession sqlsession = MyBatisUtils.getSqlsession();
        studentMapper mapper = sqlsession.getMapper(studentMapper.class);
        mapper.updateStudent(new Student(3,"tk","8888888"));
        sqlsession.commit();
        sqlsession.close();
    }

    @Test
    public  void deleteStudent(){
        SqlSession sqlsession = MyBatisUtils.getSqlsession();
        studentMapper mapper = sqlsession.getMapper(studentMapper.class);
        mapper.deleteStudent(4);
        sqlsession.commit();
        sqlsession.close();
    }
}
