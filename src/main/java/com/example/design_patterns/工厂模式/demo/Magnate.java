package com.example.design_patterns.工厂模式.demo;

/**
 * 用户
 */
public class Magnate {
    public static void main(String[] args) {
        new Driver().dirverCar(new Benz());
        new Driver().dirverCar(new Bmw());
        new Driver().dirverCar(new Audi());
    }
}
