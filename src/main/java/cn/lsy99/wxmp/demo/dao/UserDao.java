package cn.lsy99.wxmp.demo.dao;

import cn.lsy99.wxmp.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("Select * FROM user")
    public List<User> selectAllUser();
}
