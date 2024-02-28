package com.example.cloud.mapper;

import com.example.cloud.domain.Order;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {
    @Select("SELECT * FROM tb_order WHERE id = #{id}")
    Order findById(Long id);
}