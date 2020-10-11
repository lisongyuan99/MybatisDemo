package cn.lsy99.wxmp.demo.controller;

import cn.lsy99.wxmp.demo.entity.mb.News;
import cn.lsy99.wxmp.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("/findNews")
    public News findNewsById(int id) {
        return newsService.findNewsById(id);
    }

    @PostMapping("/addNews")
    public int addNews(String title, String img, String content) {
        return newsService.add(title, img, content);
    }
}
