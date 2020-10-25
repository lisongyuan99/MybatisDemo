package cn.lsy99.mybatis.demo;

import cn.lsy99.mybatis.demo.dao.mbgds.UserDynamicSqlSupport;
import cn.lsy99.mybatis.demo.dao.mbgds.UserMapper;
import cn.lsy99.mybatis.demo.dao.mds.MyMapper;
import cn.lsy99.mybatis.demo.entity.result.StudentCourseName;
import cn.lsy99.mybatis.demo.entity.table.User;
import cn.lsy99.mybatis.demo.dao.mbgds.StudentMapper;
import cn.lsy99.mybatis.demo.entity.table.Student;
import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static cn.lsy99.mybatis.demo.dao.mbgds.StudentDynamicSqlSupport.*;
import static cn.lsy99.mybatis.demo.dao.mbgds.CourseDynamicSqlSupport.*;
import static cn.lsy99.mybatis.demo.dao.mbgds.StudentCourseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@SpringBootTest
public class MBGDSTest {
    @Autowired
    UserMapper userMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    MyMapper myMapper;
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test(){
        List<User> records = userMapper.select(c ->
                c.where(UserDynamicSqlSupport.user.id, isEqualTo("text")));
        logger.warn(records.toString());
    }

    @Test
    public void test2(){

        List<Student> students = studentMapper.select(c ->
                c.join(studentCourse).on(student.id, equalTo(studentCourse.studentId))
                .where(studentCourse.score, isGreaterThanOrEqualTo(90.0), or(studentCourse.score, isLessThanOrEqualTo(60.0)))
        );
        logger.info(students.toString());
    }

    @Test
    public void test3(){
        SelectStatementProvider selectStatement = select(UserDynamicSqlSupport.user.id, UserDynamicSqlSupport.user.password)
                .from(UserDynamicSqlSupport.user)
                .where(UserDynamicSqlSupport.user.id, isEqualTo("text"))
                .build().render(RenderingStrategies.MYBATIS3);
        List<User> users = userMapper.selectMany(selectStatement);
        logger.info(users.toString());
    }

    @Test
    public void test4(){
        SelectStatementProvider selectStatement = select(UserDynamicSqlSupport.user.id, UserDynamicSqlSupport.user.password)
                .from(UserDynamicSqlSupport.user)
                .where(UserDynamicSqlSupport.user.id, isEqualTo("text"))
                .build().render(RenderingStrategies.MYBATIS3);
        List<User> users = userMapper.selectMany(selectStatement);
        logger.info(users.toString());
    }

    @Test
    public void test5(){
        SelectStatementProvider statementProvider = select(student.name, course.name, studentCourse.score)
                .from(student)
                .join(studentCourse).on(student.id, equalTo(studentCourse.studentId))
                .join(course).on(course.id, equalTo(studentCourse.courseId))
                .where(studentCourse.score, isGreaterThanOrEqualTo(90.0), or(studentCourse.score, isLessThanOrEqualTo(60.0)))
                .build().render(RenderingStrategies.MYBATIS3);
        List<StudentCourseName> result = myMapper.selectStudentAndCourseName(statementProvider);
        logger.info(result.toString());
    }
}
