package com.driver;

class A{
    public A(){

    }
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    public B(){

    }
    public String meth(){
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public Main(){

    }
    public static void main(String[] args){
        B b1 = new B();
        System.out.println(b1.meth());
    }
}