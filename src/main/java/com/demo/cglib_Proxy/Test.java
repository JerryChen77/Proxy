package com.demo.cglib_Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Cjl
 * @date 2021/7/9 21:06
 */
public class Test {
    public static void main(String[] args) {
        Fangdong fangdong = new Fangdong();
        Fangdong o = (Fangdong) Enhancer.create(
                fangdong.getClass(),
                new MethodInterceptor() {
                    /**
                     *
                     * @param o             代理对象，一般不用
                     * @param method        被代理方法
                     * @param objects       方法中传入的参数
                     * @param methodProxy   方法代理
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        System.out.println("发布房源广告");
                        System.out.println("带客看房");
                        System.out.println("签订合同");
                        Object invoke = method.invoke(fangdong, objects);
                        System.out.println("后期维修");
                        return invoke;
                    }
                }
        );

        o.chuzu(5000);
    }
}
