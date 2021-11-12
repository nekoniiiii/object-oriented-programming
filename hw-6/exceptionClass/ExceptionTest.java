package com.exceptionClass;
import java.io.IOException;

public class ExceptionTest {

    public  static void main(String[] args){
    	
        try {
        	throw new ExceptionB();
        }
        catch(Exception e) {
            System.out.println("Exception B handled!");
        }

        try {
            throw new ExceptionA();
        }

        catch(Exception e) {
            System.out.println("Exception A handled!");
        }

        try {
            throw new NullPointerException();
        }
        catch(Exception e) {
            System.out.println("NullPointerException handled!");
        }

        try {
            throw new IOException();
        }
        catch(Exception e) {
            System.out.println("IOException handled!");
        }
    }
}
