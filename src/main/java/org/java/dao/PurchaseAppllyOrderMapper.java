package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.PurchaseAppllyOrder;
@Mapper
public interface PurchaseAppllyOrderMapper {
    int deleteByPrimaryKey(String purchaseAppllyOrderId);

    int insert(PurchaseAppllyOrder record);

    int insertSelective(PurchaseAppllyOrder record);

    PurchaseAppllyOrder selectByPrimaryKey(String purchaseAppllyOrderId);

    int updateByPrimaryKeySelective(PurchaseAppllyOrder record);

    int updateByPrimaryKey(PurchaseAppllyOrder record);
}