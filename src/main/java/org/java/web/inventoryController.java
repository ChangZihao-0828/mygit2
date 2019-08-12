package org.java.web;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 昌子豪--
 * @Date: 2019/8/11 09:44
 * @Description: Frighting!!!
 */

@Controller
public class inventoryController {

    @GetMapping("/inventory/{page}")
    public String inventory(@PathVariable("page") String page){

        System.out.println("---------");
        return "inventory/"+page;
    }
    @GetMapping("/forword/{page}")
    public String forword(@PathVariable("page") String page){

        System.out.println("--------");
        return "/"+page;
    }

    @GetMapping("init")
    public Map<String,Object> init(){

        Map map = new HashMap();

        map.put("code",0);//状态正常
        map.put("msg","");
        map.put("count",100);//总数
        map.put("data","");
        System.out.println(map);
        return map;
    }
}
