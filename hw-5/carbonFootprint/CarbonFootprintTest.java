package com.carbonFootprint;
import java.util.ArrayList;

public class CarbonFootprintTest {

	public static void main(String[] args) {
		Building building = new Building(100, 25, 4);
        Car car = new Car(Car.FuelType.petrol, "Tesla", "Silver", 2020, 56190, 102.4);
        Bicycle bicycle = new Bicycle("Mountain", 12);
        
        ArrayList<CarbonFootprint> carbonfootprint = new ArrayList<CarbonFootprint>();
        carbonfootprint.add(building);
        carbonfootprint.add(car);
        carbonfootprint.add(bicycle);
        
        for (CarbonFootprint currentcarbon: carbonfootprint){
        	System.out.println(currentcarbon);
        	System.out.println(currentcarbon.getCarbonFootprint() + "\n");
        }

	}

}
