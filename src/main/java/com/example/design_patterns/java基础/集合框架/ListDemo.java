package com.example.design_patterns.java基础.集合框架;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        arrayListTest();
        linkedListTest();
    }


    public static void arrayListTest(){
        /**
         * List 可变数组  线程不安全  可存储重复数据 也可以存储null,""
         *      由于是数组 可以根据角标去获取其中的元素
         * 实现类之一：ArrayList
         * 1，初始化大小为10
         * 2，容积扩增公式  （初始化容积*3）/2 + 1
         * 3，可变数组为什么长度能够改变？ ArrayList内部定义了一个私有的未被序列化的数组elementData 通过copyOf() 覆盖原来的数组 是的ArrayList长度可变。
         * 4，ArrayList为什么能存储多种数据类型的数据？
         *    泛型
         */
        List<String> list1 = new ArrayList<String>(8);

        list1.add("1");
        list1.add("1");
        list1.add(null);
        list1.add("");

        System.out.println("list1的大小为： " + list1.size() + ", 内容为： "+ JSONObject.toJSONString(list1));

        Object[] objects = list1.toArray();

        if (objects != null && objects.length > 0){
            objects[1] = 100;
            System.out.println("数组的长度为： " + objects.length + " 包含测试：" + list1.contains(null) + ", size of list1: " + list1.size());
            for (int i = 0 ; i < objects.length ; i++){
                System.out.println(" --- " + objects[i]);
            }
        }
        list1.remove("");
        System.out.println("size of list1 : " + list1.size());

        List list2 = new ArrayList<>();
        list2.add(1);
        list2.add("1");
        list2.add(null);
        list2.add(123.56F);
        list2.add("");

        System.out.println("list2 内容为: " + JSONObject.toJSONString(list2));


        String[] strings = {"1","a",""};
        System.out.println(Arrays.toString(strings));
    }

    /**
     * 是List的实现类
     * LinkedList 是链式结构的 线程不安全  add和remove速度都比较快
     */
    public static void linkedListTest(){
        List list = new LinkedList();
        list.add(1);
        list.add(1);
        list.add("1");
        list.add("");
        list.add(null);

        System.out.println("size of list :" + list.size() + ", 内容为: " + JSONObject.toJSONString(list));
    }

    /**
     * 是List的实现类
     */
    public static void vectorTest(){

    }
}