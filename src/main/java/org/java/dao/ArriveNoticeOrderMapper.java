package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.ArriveNoticeOrder;
@Mapper
public interface ArriveNoticeOrderMapper {
    int deleteByPrimaryKey(String arriveNoticeOrderId);

    int insert(ArriveNoticeOrder record);

    int insertSelective(ArriveNoticeOrder record);

    ArriveNoticeOrder selectByPrimaryKey(String arriveNoticeOrderId);

    int updateByPrimaryKeySelective(ArriveNoticeOrder record);

    int updateByPrimaryKey(ArriveNoticeOrder record);
}