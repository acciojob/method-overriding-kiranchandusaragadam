package com.driver;

public class Main {
    static class A{
        public A(){

        }
        public String meth(){
            return "Invoking method from class A";
        }
    }

    static class B extends A{
        public B(){

        }
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
    public Main(){

    }
    public static void main(String[] args){
        B b1 = new B();
        System.out.println(b1.meth());
    }
}