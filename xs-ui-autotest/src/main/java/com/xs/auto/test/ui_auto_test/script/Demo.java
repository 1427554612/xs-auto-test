package com.xs.auto.test.ui_auto_test.script;

public class Demo {


    public void a(){
        System.out.println("a执行了...");
        b();
    }
    public void b(){
        System.out.println("b执行了...");
        c();
    }

    public void c(){
        System.out.println("c执行了...");
        try {
            int a = 10;
            int b =0;
            int c = a/b;
            System.out.println("c运算了...");
        }catch (Exception e ){
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                System.out.println(stackTrace[i]);
            }
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.a();
    }
}
