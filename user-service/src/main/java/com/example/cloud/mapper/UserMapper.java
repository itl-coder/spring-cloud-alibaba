package com.example.cloud.mapper;

import com.example.cloud.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Select("select * from tb_user where id = #{id}")
    User findById(@Param("id") Long id);
}