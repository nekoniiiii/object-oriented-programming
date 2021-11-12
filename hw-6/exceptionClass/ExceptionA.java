package com.exceptionClass;

public class ExceptionA extends Exception {
	private static final long serialVersionUID = 1L;

	public ExceptionA(String s){
        super(s);
    }

    public ExceptionA(){}

    public ExceptionA(String s, Throwable throwable){
        super(s, throwable);
    }

    public ExceptionA(Throwable throwable){
        super(throwable);
    }
}
