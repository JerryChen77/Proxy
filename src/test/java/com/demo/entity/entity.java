package com.demo.entity;


import com.demo.entity.proxy.FangdongProxy;
import org.junit.Test;

/**
 * @author Cjl
 * @date 2021/7/9 20:16
 */
public class entity {
    @Test
    public void test(){
        FangdongProxy fangdongProxy = new FangdongProxy();
        double chuzu = fangdongProxy.chuzu(3000);
        System.out.println(chuzu);


    }
}
