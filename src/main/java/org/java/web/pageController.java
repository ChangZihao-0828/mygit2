package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: 昌子豪
 * @Date: 2019/8/13 09:25
 * @Description: Frighting!!!
 */

@Controller
public class pageController {

    @GetMapping("/forword/{page}")
    public String forword(@PathVariable("page") String page){

        System.out.println("--------");
        return "/"+page;
    }
}
