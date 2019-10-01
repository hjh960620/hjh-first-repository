package com.hjh.test;

/**
 * Author Hu junhao
 * Create 2019/9/28
 */
public class Tester {
    public static void main(String[] args) {

//        System.out.println(enumTest.AddUser);
//        System.out.println(enumTest.DeleteUser);

//        System.out.println(getEnumType(enumTest.AddUser));

        //遍历枚举类型
//        for(enumTest enumTest:enumTest.values()){
//            System.out.println(enumTest.name());
//        }

        String a = "AddUser";

        for(enumTest enumTest:enumTest.values()){
            if(enumTest.name().contains(a)){
                System.out.println("true");
                System.out.println(enumTest.getType());
                return ;
            }
            else{
                System.out.println("false");
                return;
            }

        }


    }

    //获取枚举类型具体的值
    public static String getEnumType(enumTest enumTest){
        return enumTest.getType();
    }
}
