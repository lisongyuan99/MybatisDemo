package cn.lsy99.mybatis.demo.dao.mds;

import cn.lsy99.mybatis.demo.entity.result.StudentCourseName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import java.util.List;

@Mapper
public interface MyMapper {
    @SelectProvider(type= SqlProviderAdapter.class, method="select")
    @ResultMap("StudentCourseName")
    List<StudentCourseName> selectStudentAndCourseName(SelectStatementProvider selectStatementProvider);
}
