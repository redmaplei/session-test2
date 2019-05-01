package com.wys.sessiontest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author wys
 * created in 4:32 2019/5/1
 */
@RestController
public class Demo {


    @GetMapping("demo")
    public void demo(Integer uid, HttpServletRequest request){
        HttpSession sessoin=request.getSession();//这就是session的创建
        sessoin.setAttribute(uid.toString(),"TOM");//给session添加属性属性name： username,属性 value：TOM
        sessoin.setAttribute("password","tommmm");//添加属性 name: password; value: tommmm
        System.out.println(sessoin.getId());
    }
}
