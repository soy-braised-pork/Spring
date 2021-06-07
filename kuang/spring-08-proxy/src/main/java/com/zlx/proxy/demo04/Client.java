package com.zlx.proxy.demo04;

import com.zlx.proxy.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userServiceImpl);//设置要代理的对象
        //动态生成代理类
        UserServiceImpl proxy = (UserServiceImpl) pih.getProxy();

        proxy.delect();
    }
}
