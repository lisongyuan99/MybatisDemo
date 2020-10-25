package cn.lsy99.mybatis.demo.entity.table;

import javax.annotation.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class News {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5306274+08:00", comments="Source field: news.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5316254+08:00", comments="Source field: news.title")
    private String title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5316254+08:00", comments="Source field: news.img")
    private String img;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5316254+08:00", comments="Source field: news.content")
    private String content;
}