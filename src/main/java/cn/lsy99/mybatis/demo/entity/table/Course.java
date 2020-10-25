package cn.lsy99.mybatis.demo.entity.table;

import javax.annotation.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Course {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5376083+08:00", comments="Source field: course.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5376083+08:00", comments="Source field: course.name")
    private String name;
}