package com.someClass;

public class SomeClass {
    public static void main(String[] args) {
        try {
        SomeClass a = new SomeClass();
        }
        catch (Exception e) {
            System.out.println("Exception handled!");
        }
    }

    public SomeClass() throws Exception {
        throw new Exception("Exception");
    }
    
}
