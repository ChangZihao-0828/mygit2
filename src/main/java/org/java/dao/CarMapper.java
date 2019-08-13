package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Car;
@Mapper
public interface CarMapper {
    int deleteByPrimaryKey(Integer carId);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer carId);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}