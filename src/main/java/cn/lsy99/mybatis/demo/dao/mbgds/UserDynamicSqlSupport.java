package cn.lsy99.mybatis.demo.dao.mbgds;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5133787+08:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5133787+08:00", comments="Source field: user.id")
    public static final SqlColumn<String> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5143644+08:00", comments="Source field: user.password")
    public static final SqlColumn<String> password = user.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5133787+08:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public User() {
            super("user");
        }
    }
}