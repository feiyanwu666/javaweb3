package com.czxy.demo1.web.servlet;

import cn.itcast.servlet.BaseServlet;
import com.czxy.demo1.domain.Person;

import java.util.Arrays;

/**
 * Created by xps13 on 2019/3/19.
 */
public class Demo1Servlet extends BaseServlet {

    public String run4(){
        //2、接收数据
        Object uname = getRequest().getAttribute("uname");
        System.out.println(uname);
        return null;
    }
    public String run3(){
        //1、设置数据
        getRequest().setAttribute("uname","老王");
        return "forward:/d1?method=run4";
    }
    /**
     * 接收参数
     * @return
     */
    public String run2(){
        //方式一：toBean.     仅适合于多个参数的获取
        Person person = toBean(Person.class);
        System.out.println(person);
        //方式二：request自带的 getParameter()   适合于获取某一个参数
        //获取不到，返回为null
        String username = getRequest().getParameter("username");
        System.out.println(username);
        String[] hobby = getRequest().getParameterValues("hobby");
        System.out.println(Arrays.toString(hobby));
        return null;
    }
    public String run1(){
        System.out.println("hello world.第？个servlet");
        return null;
    }


}
