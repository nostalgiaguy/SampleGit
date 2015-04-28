//****************************************Polymorphism and constructors example*************************

package com.nostalgiaguy.coreconceptpage3;

abstract class A8 {
    
    // Make the method func final and run again the example
    abstract void func();

    A8() {

  System.out.println("A8() before func()");

  func();

  System.out.println("A8() after func()");
    }
}

class B8 extends A8 {

    private int value = 1;

    B8(int val) {

  value = val;

  System.out.println("B8.B(), value = " + value);
    }

    @Override
    void func() {

  System.out.println("B8.func(), value = " + value);
    }
}

public class Polymorphism {

    public static void main(String[] args) {

  new B8(5);

    }
}
