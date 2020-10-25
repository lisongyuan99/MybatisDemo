package cn.lsy99.mybatis.demo.entity.table;

import javax.annotation.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5085456+08:00", comments="Source field: user.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-25T12:00:17.5105405+08:00", comments="Source field: user.password")
    private String password;
}