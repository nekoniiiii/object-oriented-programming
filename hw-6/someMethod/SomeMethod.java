package com.someMethod;

public class SomeMethod {
	public static void main(String[] args) {
		try {
			someMethod();
		} 
		catch (Exception e) {
			System.out.println("Handled in main!");
		}
	}
	
	public static void someMethod() throws Exception{
		try {
			someMethod2();
		}
		catch(Exception e) {
			System.out.println("someMethod rethrow!");
			throw e;
		}
    }
	
    public static void someMethod2() throws Exception{
        throw new Exception("Thrown");
    }
	
}
