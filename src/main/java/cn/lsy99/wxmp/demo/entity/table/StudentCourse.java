package cn.lsy99.wxmp.demo.entity.table;

import javax.annotation.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentCourse {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source field: student_course.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source field: student_course.student_id")
    private Integer studentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source field: student_course.course_id")
    private Integer courseId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-13T14:26:50.3357613+08:00", comments="Source field: student_course.score")
    private Double score;
}