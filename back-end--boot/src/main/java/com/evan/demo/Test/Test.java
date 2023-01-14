package com.evan.demo.Test;

public class Test {
    public void test() throws RuntimeException{
        System.out.println("超时了");
        throw new RuntimeException();
    }
}
