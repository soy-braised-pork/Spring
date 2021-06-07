package com.hellospring.zlx;

//叶子：表示已被spring托管
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    //set 依赖注入
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" + "str=" + str + '\'' + '}';
    }

}
