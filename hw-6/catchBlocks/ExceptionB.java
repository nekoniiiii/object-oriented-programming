package com.catchBlocks;

public class ExceptionB extends ExceptionA{
	private static final long serialVersionUID = 1L;

	public ExceptionB(String s){
        super(s);
    }
    public ExceptionB(String s, Throwable throwable){
        super(s, throwable);

    }

    public ExceptionB(){}

    public ExceptionB(Throwable throwable){
        super(throwable);
    }
}