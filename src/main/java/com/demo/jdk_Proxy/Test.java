package com.demo.jdk_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Cjl
 * @date 2021/7/9 20:51
 */
public class Test {
    public static void main(String[] args) {
        Fangdong fangdong = new Fangdong();
        Advice advice = new Advice();
        chuzu proxyInstance = (chuzu) Proxy.newProxyInstance(
                fangdong.getClass().getClassLoader(),
                fangdong.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        advice.beford();
                        Object invoke = method.invoke(fangdong, args);
                        advice.after();
                        return invoke;
                    }
                }
        );

        proxyInstance.chuzu(5000);

    }
}
