package com.driver;

public class Main {
<<<<<<< HEAD
    static class A{
        public A(){

        }
        public String meth(){
=======
    public Main() {

    }

    public static class A {
        public A() {

        }

        public String meth() {
>>>>>>> b3d1156b9f7cc31ff5ec3c645dfdb16f9c66923f
            return "Invoking method from class A";
        }
    }

<<<<<<< HEAD
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
=======
    public static class B extends A {
        public B() {

        }

        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        String s = obj.meth();
        System.out.println(s);
>>>>>>> b3d1156b9f7cc31ff5ec3c645dfdb16f9c66923f
    }
}