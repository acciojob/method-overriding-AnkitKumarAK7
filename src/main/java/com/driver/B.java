package com.driver;

public class B extends A{
    @Override
    public String meth(){
        System.out.println(super.meth());
        return "Method is overridden in Extended class B";
    }
}
