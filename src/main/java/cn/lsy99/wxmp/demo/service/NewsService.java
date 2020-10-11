package cn.lsy99.wxmp.demo.service;

import cn.lsy99.wxmp.demo.dao.mb.NewsDao;
import cn.lsy99.wxmp.demo.entity.mb.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewsService {
    @Autowired
    private NewsDao newsDao;

    public News findNewsById(int id) {
        return newsDao.findById(id);
    }

    public int add(String title, String img, String content) {
        News addNews = News.builder().title(title).img(img).content(content).build();
        return newsDao.add(addNews);
    }
}
