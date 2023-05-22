package com.example.myapplication.core;

import java.util.ArrayList;
import java.util.List;

public class TestOutAndIn {
    ParentClass parentClass = new ParentClass();
    SonClass sonClass = new SonClass();

    void test1() {
        // TODO: 2023/5/22 extends
//        ? extends ParentClass == 只能读取
        List<? extends ParentClass> list = new ArrayList<>();
//    不能修改
//        list.add(ParentClass);
//        list.add(sonClass);
//        能获取
        ParentClass parentClass = list.get(0);
        // TODO: 2023/5/22 super
//        ? super
        List<? super SonClass> list1 = new ArrayList<>();
//        能添加
        list1.add(sonClass);
//        不能获取
//        SonClass sonClass =  list1.get(0);
    }

    void test02() {
        List<SonClass> sonClasses = new ArrayList<>();
        forshow(sonClasses);
    }

    private void forshow(List<? extends ParentClass> list) {
        list.get(0);
        for (ParentClass listi : list) {

        }
//        不能修改
//        list.add(parentClass)
    }

    private void forMethod(List<? super SonClass> lists) {
//       SonClass sonClass =  lists.get(0);
        lists.add(sonClass);
    }

    private void test3() {
        List<ParentClass> parentClasses = new ArrayList<>();
        forMethod(parentClasses);
    }
}
