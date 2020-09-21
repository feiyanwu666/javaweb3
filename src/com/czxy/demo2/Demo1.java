package com.czxy.demo2;

import cn.itcast.xml.XmlUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xps13 on 2019/3/19.
 */
public class Demo1 {
    /*
    * 增删改查   xml
    * */
    //增：追加一条数据
    @Test
    public void run1(){
        XmlUtils.write("D:\\xx1.xml",new User(null,"小严严","123","男"),true);
    }
    //增：追加多条数据
    @Test
    public void run2(){
        List<User> ulist = new ArrayList<>();
        ulist.add(new User(null,"小田田","123","男"));
        ulist.add(new User(null,"小辉辉","321","男"));
        ulist.add(new User(null,"小荣荣","987","女"));
        XmlUtils.write("D:\\xx1.xml",ulist,true);
    }
    //查询：查询所有
    @Test
    public void run3(){
        List<User> ulist = XmlUtils.readAll("D:\\xx1.xml", User.class);
        for (User user : ulist) {
            System.out.println(user);
        }
    }
    //修改
    @Test
    public void run4(){
        //1、查询所有数据
        List<User> ulist = XmlUtils.readAll("D:\\xx1.xml", User.class);
        //2、遍历集合，修改符合要求的数据
        for (User user : ulist) {
            if(user.getUsername().equals("小荣荣")){
                user.setUsername("大荣荣");
            }
        }
        //3、以覆盖方式写出XML中
        XmlUtils.write("D:\\xx1.xml",ulist,false);
    }
    //删除
    @Test
    public void run5(){
        //1、查询所有数据
        List<User> ulist = XmlUtils.readAll("D:\\xx1.xml", User.class);
        //2、遍历集合，删除符合要求的数据
        //增强for遍历时，集合长度不能改变（增、删）
        //普通for，迭代器
        Iterator<User> it = ulist.iterator();
        //hasNext()  有下一个么？  true有，false没有
        //next()    取出当前元素，并指向下一个
        //remove()  删除
        while(it.hasNext()){
            User u = it.next();
            if(u.getSex().equals("男")){
                it.remove();
            }
        }
        //3、以覆盖方式写出XML中
        XmlUtils.write("D:\\xx1.xml",ulist,false);
    }
}
