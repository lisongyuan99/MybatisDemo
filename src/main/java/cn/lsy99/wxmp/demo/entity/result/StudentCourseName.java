package cn.lsy99.wxmp.demo.entity.result;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentCourseName {
    private String studentName;
    private String courseName;
    private int score;
}
