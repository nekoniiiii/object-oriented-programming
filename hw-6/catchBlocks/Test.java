package com.catchBlocks;

public class Test{
	public static void main(String[] args) {
		try {
			throw new ExceptionA();
		} catch (ExceptionB e) {
			System.out.println("Exception B");
		} catch (ExceptionA e) {
			System.out.println("Exception A");
		}
	}
}