package com.carbonFootprint;

public class Car implements CarbonFootprint {
	
	enum FuelType {
		diesel, petrol;
	}
	
    private FuelType fuelType;
    private String model;
    private String colour;
    private int year;
    private double price;
    private double distance;
    
    public Car(FuelType fuelType, String model, String colour, int year, int price, double distance) {
        setFueltype(fuelType);
        setModel(model);
        setColour(colour);
        setYear(year);
        setPrice(price);
        setDistance(distance);
    }
    
    public void setFueltype(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    
    public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year < 1900)
	        throw new IllegalArgumentException("Year must be above 1900!");
		
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0)
	        throw new IllegalArgumentException("Price should be grater than zero!");
		
		this.price = price;
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
        double fuelfactor;
        
        if(fuelType == FuelType.diesel) {
            fuelfactor = 0.5;
            return distance * (year/12) * fuelfactor;

        }
        
        else if(fuelType == FuelType.petrol) {
            fuelfactor = 0.1;
            return distance * (year/12) * fuelfactor;
        }
        
        return 0;
    }
    
    public String toString(){
        return String.format("Carbon footprint for the car model " + getModel() +  " is ");
    }

}
