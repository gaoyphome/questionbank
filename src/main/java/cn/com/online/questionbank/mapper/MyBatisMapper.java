package cn.com.online.questionbank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.com.online.questionbank.entity.MyBatis;





@Mapper
public interface MyBatisMapper {

    @Select(value = "select * from test")
    List<MyBatis> getList();

   
}
