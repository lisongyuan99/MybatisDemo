package cn.lsy99.wxmp.demo.service;

import cn.lsy99.wxmp.demo.dao.UserDao;
import cn.lsy99.wxmp.demo.dao.mbg.UserMapper;
import cn.lsy99.wxmp.demo.entity.User;
import cn.lsy99.wxmp.demo.entity.mbg.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;

    public String Login(String id, String user){
        return "success";
    }
    public List<User> get(){
        return userDao.selectAllUser();
    }

    public List<cn.lsy99.wxmp.demo.entity.mbg.User> get2(){
        return userMapper.selectByExample(new UserExample());
    }
}
