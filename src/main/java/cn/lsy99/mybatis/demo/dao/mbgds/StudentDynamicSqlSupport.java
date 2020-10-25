package cn.lsy99.mybatis.demo.dao.mbgds;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StudentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5346158+08:00", comments="Source Table: student")
    public static final Student student = new Student();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5346158+08:00", comments="Source field: student.id")
    public static final SqlColumn<Integer> id = student.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5346158+08:00", comments="Source field: student.name")
    public static final SqlColumn<String> name = student.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5346158+08:00", comments="Source field: student.gender")
    public static final SqlColumn<String> gender = student.gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5346158+08:00", comments="Source field: student.age")
    public static final SqlColumn<Integer> age = student.age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5346158+08:00", comments="Source Table: student")
    public static final class Student extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> gender = column("gender", JDBCType.VARCHAR);

        public final SqlColumn<Integer> age = column("age", JDBCType.INTEGER);

        public Student() {
            super("student");
        }
    }
}