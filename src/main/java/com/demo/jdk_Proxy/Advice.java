package com.demo.jdk_Proxy;

/**
 * @author Cjl
 * @date 2021/7/9 20:48
 */
public class Advice {
    public void beford(){
        System.out.println("发布房源广告");
        System.out.println("带客看房");
        System.out.println("签订合同");

    }
    public void after(){
        System.out.println("后期维修");
    }
}
