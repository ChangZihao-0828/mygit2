package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.PurchaseOrder;
@Mapper
public interface PurchaseOrderMapper {
    int deleteByPrimaryKey(String purchaseOrderId);

    int insert(PurchaseOrder record);

    int insertSelective(PurchaseOrder record);

    PurchaseOrder selectByPrimaryKey(String purchaseOrderId);

    int updateByPrimaryKeySelective(PurchaseOrder record);

    int updateByPrimaryKey(PurchaseOrder record);
}