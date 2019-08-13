package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.CustomerOrder;
@Mapper
public interface CustomerOrderMapper {
    int deleteByPrimaryKey(String customerOrderId);

    int insert(CustomerOrder record);

    int insertSelective(CustomerOrder record);

    CustomerOrder selectByPrimaryKey(String customerOrderId);

    int updateByPrimaryKeySelective(CustomerOrder record);

    int updateByPrimaryKey(CustomerOrder record);
}