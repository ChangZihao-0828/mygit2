package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.CarDispatch;
@Mapper
public interface CarDispatchMapper {
    int deleteByPrimaryKey(String carDispatchId);

    int insert(CarDispatch record);

    int insertSelective(CarDispatch record);

    CarDispatch selectByPrimaryKey(String carDispatchId);

    int updateByPrimaryKeySelective(CarDispatch record);

    int updateByPrimaryKey(CarDispatch record);
}