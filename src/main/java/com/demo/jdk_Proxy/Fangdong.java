package com.demo.jdk_Proxy;

/**
 * @author Cjl
 * @date 2021/7/9 20:47
 */
public class Fangdong implements chuzu {

    @Override
    public double chuzu(double money) {
        System.out.println("收到租金123："+money);
        return money;
    }
}
