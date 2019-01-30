package com.Al.Interview;

import javax.print.DocFlavor;

public class StaticInnerClass {
    private int outerNumber;
    private static String log;

    private static class StaticClass{
        private int staticInnerNumber;


        public int getStaticInnerNumber() {
            return staticInnerNumber;
        }

        public void setStaticInnerNumber(int staticInnerNumber) {
            this.staticInnerNumber = staticInnerNumber;
        }

        public String getOuterClassVariable(){
            return log;
        }

        public void getStaticClassReference(){
            System.out.println("the reference for InnerStatic class is " + this);
        }
    }

    private class InnerClass{
        public void getOuterClassReference(){
            System.out.println("the outter class reference is " + StaticInnerClass.this);
        }
    }

    public static void main(String[] args){
        StaticClass test = new StaticInnerClass.StaticClass();
        StaticInnerClass testInner = new StaticInnerClass();
        InnerClass innerclass = testInner.new InnerClass();
        System.out.println(test.getOuterClassVariable());
        test.getStaticClassReference();
        innerclass.getOuterClassReference();
    }
}
