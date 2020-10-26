package com.mybatis.mi.mapper;

import com.mybatis.mi.entity.Test1;
import org.apache.ibatis.annotations.Param;

/**
 * 增删改永远返回影响的行数
 */
public interface TestInsertMapper {
    /**
     * 对应对应的持久化对象
     *
     * @return
     */
    int insert(@Param("test") Test1 test, @Param("tid") int tid);

}
