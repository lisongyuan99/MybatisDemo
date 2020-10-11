package cn.lsy99.wxmp.demo.controller;

import cn.lsy99.wxmp.demo.entity.mb.User;
import cn.lsy99.wxmp.demo.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(String id, String password) {
        logger.info(id);
        logger.info(password);
        // String result = loginService.loginSuccess(id, password) ? "success" : "fail";
        String result = loginService.Login(id, password);
        logger.info(result);
        return result;
    }

    @GetMapping("/get")
    public List<User> get (){
        return loginService.get();
    }

    @GetMapping("/get2")
    public List<cn.lsy99.wxmp.demo.entity.mbg.User> get2 (){
        return loginService.get2();
    }
}
