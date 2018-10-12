package com.example.design_patterns.单例模式;

public class Singleton {

    private static Singleton singleton = null;

    /**
     * 私有化构造函数
     */
    private Singleton(){

    }

    /**
     * 对外提供公共的获取对象的方法
     * @return
     */
    public static synchronized Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
