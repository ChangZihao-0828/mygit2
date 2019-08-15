package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.CarDeployLine;
@Mapper
public interface CarDeployLineMapper {
    int deleteByPrimaryKey(String carDeployLineId);

    int insert(CarDeployLine record);

    int insertSelective(CarDeployLine record);

    CarDeployLine selectByPrimaryKey(String carDeployLineId);

    int updateByPrimaryKeySelective(CarDeployLine record);

    int updateByPrimaryKey(CarDeployLine record);
}