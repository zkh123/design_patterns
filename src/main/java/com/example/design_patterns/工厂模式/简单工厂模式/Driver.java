package com.example.design_patterns.工厂模式.简单工厂模式;

/**
 * 工厂类
 */
public class Driver {

    /**
     * 工厂类 造对象的
     * @param s
     * @return
     * @throws Exception
     */
    public static Car driverCar(String s) throws Exception {
        if (s.equalsIgnoreCase("Benz"))
            return new Benz();
        else if (s.equalsIgnoreCase("Bmw"))
            return new Bmw();
        else if (s.equalsIgnoreCase("Audi"))
            return new Audi();
        else throw new Exception();
    }
}
