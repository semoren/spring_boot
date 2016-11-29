package com.sermo.web.domain;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author sermo
 * @version 2016/11/29.
 */
@Mapper
public interface UserMapper {

    @Select("select id, age, name from user where name=#{name}")
    User findByName(@Param("name") String username);

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    int insertByMap(Map<String, Object> map);

    @Delete("delete from user")
    void deleteAll();

    @Results({
        @Result(column = "name", property = "username"),
        @Result(column = "age", property = "age")
    })
    @Select("select name, age from user")
    List<UserVo> findAll();
}
