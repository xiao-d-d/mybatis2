package com.mybatis.mi.mapper;


import com.mybatis.mi.entity.Cate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface CateMapper {
    List<Cate> selectList();
    int insert(@Param("cate") Cate cate);
}
