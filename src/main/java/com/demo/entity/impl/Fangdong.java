package com.demo.entity.impl;

import com.demo.entity.Chuzu;

/**
 * @author Cjl
 * @date 2021/7/9 20:05
 */
public class Fangdong implements Chuzu {
    public Fangdong() {
    }

    @Override
    public double chuzu(double money) {
        System.out.println("收到房租："+money+"元");
        return money;
    }
}
