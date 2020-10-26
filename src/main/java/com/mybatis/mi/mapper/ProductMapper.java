package com.mybatis.mi.mapper;

import com.mybatis.mi.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品信息
 */
public interface ProductMapper {
    List<Product> selectListByCateId(@Param("cateId") int cateId);

    int insert(@Param("product") Product product);

}
