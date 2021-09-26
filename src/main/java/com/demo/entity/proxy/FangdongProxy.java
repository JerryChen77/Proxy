package com.demo.entity.proxy;

import com.demo.entity.Chuzu;
import com.demo.entity.impl.Fangdong;

/**
 * @author Cjl
 * @date 2021/7/9 20:06
 */
public class FangdongProxy implements Chuzu {
    Fangdong fangdong = new Fangdong();


    @Override
    public double chuzu(double money) {
        System.out.println("发布房源出租广告。。。");
        System.out.println("带客看房");
        System.out.println("签订合同");
        System.out.println("收取总房租"+money+"其中佣金："+(money*0.1));
        fangdong.chuzu(money*0.9);
        return (money*0.1);
    }
}
