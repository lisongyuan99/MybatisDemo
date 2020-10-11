package cn.lsy99.wxmp.demo;

import cn.lsy99.wxmp.demo.dao.mb.NewsDao;
import cn.lsy99.wxmp.demo.entity.mb.News;
import cn.lsy99.wxmp.demo.entity.mb.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private NewsDao newsDao;
	@Test
	void contextLoads() {
		News result = newsDao.findById(1);
		System.out.println(result);
	}

}
