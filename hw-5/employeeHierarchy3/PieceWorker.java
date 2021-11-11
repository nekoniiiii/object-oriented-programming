package com.employeeHierarchy;

public class PieceWorker extends Employee {
	private int pieces;
	private double wage;
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int piece, double wage) {
		super(firstName, lastName, socialSecurityNumber);
        setPieces(piece);
        setWage(wage);
	}

	public double getPiece() {
		return pieces;
	}

	public void setPieces(int piece) {
		if(piece < 0)
            throw new IllegalArgumentException("Piece cannot be negative!");
        else
            this.pieces = piece;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(wage < 0)
            throw new IllegalArgumentException("Wage cannot be negative!");
        else
            this.wage = wage;
	}
	
	public double earnings() {
		return getWage()*getPiece();
	}
	
	public String toString(){
        return String.format(super.toString() + "\nWage per piece: " + getWage() + "\nPiece(s) produced: " + getPiece() + "\nEarnings: " + earnings() + "\n");
    }
}
