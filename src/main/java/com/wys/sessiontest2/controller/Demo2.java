package com.wys.sessiontest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author wys
 * created in 4:45 2019/5/1
 */
@RestController
public class Demo2 {


    @GetMapping("demo2")
    public void demo(Integer uid, HttpServletRequest request){
        HttpSession sessoin=request.getSession();//这就是session的创建
        Object username = sessoin.getAttribute(uid.toString());
        System.out.println(username);
        System.out.println(sessoin.getId());
    }

}
