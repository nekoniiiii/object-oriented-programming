package com.outerScopes;

public class Test {
	public static void main(String[] args) {
        try {
            throwException();
        } catch(Exception e) {
            System.out.println("Caught in main:");
            System.out.println(e.getMessage());
        }
    }

    private static void throwException() throws Exception {
        try {
            System.out.println("Method throwException");
            throw new Exception("Exception from throwException");
        } 
        catch(Exception exception) {
            System.out.println("Exception handled partially in throwException");
            throw exception;
        }
        finally {
            System.out.println("Finally executed in throwException");
        }
    }
}
