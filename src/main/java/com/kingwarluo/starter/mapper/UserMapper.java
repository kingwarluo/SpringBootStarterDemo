package com.kingwarluo.starter.mapper;

import com.kingwarluo.starter.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User get(@Param("id") Long id);

}
