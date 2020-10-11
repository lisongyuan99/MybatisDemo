package cn.lsy99.wxmp.demo.dao.mb;

import cn.lsy99.wxmp.demo.entity.mb.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsDao {
    News findById(int id);
    int add(News news);
    void deleteById(int id);
}
