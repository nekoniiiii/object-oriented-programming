package com.carbonFootprint;

public class Bicycle implements CarbonFootprint {
	
	private String type;
    private double distance;
    private final double caloriesPerMile = 48.0;
    
    public Bicycle(String type, double distance){
        setType(type);
        setDistance(distance);
    }

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		if(distance < 0)
	        throw new IllegalArgumentException("Distance should be grater than zero!");
	    
		this.distance = distance;
	}
    
    public double getCarbonFootprint(){
        return caloriesPerMile * (distance / 12);
    }
    
    public String toString(){
        return String.format("Carbon footprint for the " + getType() + " bicycle is ");
    }

}
