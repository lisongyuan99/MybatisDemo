package cn.lsy99.wxmp.demo.dao.mbgds;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NewsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source Table: news")
    public static final News news = new News();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source field: news.id")
    public static final SqlColumn<Integer> id = news.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source field: news.title")
    public static final SqlColumn<String> title = news.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source field: news.img")
    public static final SqlColumn<String> img = news.img;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source field: news.content")
    public static final SqlColumn<String> content = news.content;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source Table: news")
    public static final class News extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> title = column("title", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> img = column("img", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.LONGVARCHAR);

        public News() {
            super("news");
        }
    }
}