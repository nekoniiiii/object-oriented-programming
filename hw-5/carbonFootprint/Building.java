package com.carbonFootprint;

public class Building implements CarbonFootprint {
	private double area;
    private double temperature;
    private int floor;
    
    public Building(double area, double temperature, int floor) {
    	setArea(area);
        setTemperature(temperature);
        setFloor(floor);
    }

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		if (area <= 0)
            throw new IllegalArgumentException("Area cannot be below 0!");
		
		this.area = area;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		if (floor <= 0)
            throw new IllegalArgumentException("Number of floor cannot be below 1!");
		
		this.floor = floor;
	}
	
	@Override
    public double getCarbonFootprint(){
        return getTemperature() * getArea() * 0.2;
    }
	
    public String toString(){
        return String.format("Carbon footprint from the bulding with " + getFloor() + " floor is ");
    }
}
