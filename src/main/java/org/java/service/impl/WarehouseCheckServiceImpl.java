package org.java.service.impl;

import org.java.dao.WarehouseCheckMapper;
import org.java.entity.WarehouseCheck;
import org.java.service.WarehouseCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 昌子豪
 * @Date: 2019/8/13 11:14
 * @Description: Frighting!!!
 */

@Service
public class WarehouseCheckServiceImpl implements WarehouseCheckService {

    @Autowired
    private WarehouseCheckMapper warehouseCheckMapper;

    @Override
    public List<WarehouseCheck> findWarehouseCheck() {

        return warehouseCheckMapper.findWarehouseCheck();
    }

    @Override
    public Integer findWarehouseCheckCount() {
        return warehouseCheckMapper.findWarehouseCheckCount();
    }
}
