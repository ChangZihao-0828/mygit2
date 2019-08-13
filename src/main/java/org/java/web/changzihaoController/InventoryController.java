package org.java.web.changzihaoController;

import org.java.entity.WarehouseCheck;
import org.java.service.WarehouseCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 昌子豪--
 * @Date: 2019/8/11 09:44
 * @Description: Frighting!!!
 */

@Controller
public class InventoryController {

    @Autowired
    private WarehouseCheckService warehouseCheckService;

    @GetMapping("/inventory/{page}")
    public String inventory(@PathVariable("page") String page){

        System.out.println("---------");
        return "inventory/"+page;
    }


    @GetMapping("warehouseCheck")
    @ResponseBody
    public Map<String,Object> warehouseCheck(){

        List<WarehouseCheck> warehouseCheck = warehouseCheckService.findWarehouseCheck();

        Integer count = warehouseCheckService.findWarehouseCheckCount();

        Map map = new HashMap();

        map.put("code",0);//状态正常
        map.put("msg","");
        map.put("count",count);//总数
        map.put("data",warehouseCheck);
        return map;
    }

    @GetMapping("matterCheck")
    @ResponseBody
    public Map<String,Object> matterCheck(){

        List<WarehouseCheck> warehouseCheck = warehouseCheckService.findWarehouseCheck();

        Integer count = warehouseCheckService.findWarehouseCheckCount();

        Map map = new HashMap();

        map.put("code",0);//状态正常
        map.put("msg","");
        map.put("count",count);//总数
        map.put("data",warehouseCheck);
        return map;
    }
    @GetMapping("matterScrap")
    @ResponseBody
    public Map<String,Object> matterScrap(){

        List<WarehouseCheck> warehouseCheck = warehouseCheckService.findWarehouseCheck();

        Integer count = warehouseCheckService.findWarehouseCheckCount();

        Map map = new HashMap();

        map.put("code",0);//状态正常
        map.put("msg","");
        map.put("count",count);//总数
        map.put("data",warehouseCheck);
        return map;
    }
    @GetMapping("stockCheck")
    @ResponseBody
    public Map<String,Object> stockCheck(){

        List<WarehouseCheck> warehouseCheck = warehouseCheckService.findWarehouseCheck();

        Integer count = warehouseCheckService.findWarehouseCheckCount();

        Map map = new HashMap();

        map.put("code",0);//状态正常
        map.put("msg","");
        map.put("count",count);//总数
        map.put("data",warehouseCheck);
        return map;
    }

}
