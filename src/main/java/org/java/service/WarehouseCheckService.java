package org.java.service;

import org.java.entity.WarehouseCheck;

import java.util.List;

/**
 * @Auther: 昌子豪
 * @Date: 2019/8/13 11:10
 * @Description: Frighting!!!
 */


public interface WarehouseCheckService {

    public List<WarehouseCheck> findWarehouseCheck();

    public Integer findWarehouseCheckCount();
}
