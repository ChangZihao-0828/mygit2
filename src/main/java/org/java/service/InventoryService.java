package org.java.service;

import org.java.entity.*;

import java.util.List;

/**
 * @Auther: 昌子豪
 * @Date: 2019/8/13 11:10
 * @Description: Frighting!!!
 */


public interface InventoryService {

    public List<WarehouseCheck> findWarehouseCheck();

    public Integer findWarehouseCheckCount();

    public List<MatterCheck> findMatterCheck();

    public Integer findMatterCheckCount();

    public List<MatterReject> findMatterReject();

    public Integer findMatterRejectCount();

    public List<StockCheck> findStockCheck();

    public Integer findStockCheckCount();

    public void delWarehouseCheck(String warehouseCheckId);

    public void delMatterCheck(String matterCheckId);

    public void delStockCheck(String stockCheckId);

    public void delMatterReject(String matterCheckId);

    public void addWarehouseCheck(WarehouseCheck warehouseCheck);

    public void addMatterCheck(MatterCheck matterCheck);

    public void addStockCheck(StockCheck stockCheck);

    public void addMatterReject(MatterReject matterReject);

    public void updateWarehouseCheck(WarehouseCheck warehouseCheck);

    public void updateMatterCheck(MatterCheck matterCheck);

    public void updateStockCheck(StockCheck stockCheck);

    public void updateMatterReject(MatterReject matterReject);


}
