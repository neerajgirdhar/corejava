package com.corejava;

public class OuterClass {

    static  class   NestedClass{
        public void testNestedClassMethod(){
            System.out.println("in testNestedClassMethod ");
        }

    }
    class InnerClass{
        public void testInnerClassMethod(){
            System.out.println("in testInnerClassMethod ");
        }
    }

    public static void main(String args[]){
        OuterClass outerClass= new OuterClass();
        outerClass.new InnerClass().testInnerClassMethod();
        OuterClass.NestedClass  nested = new NestedClass();
        nested.testNestedClassMethod();
    }

}
