package com.trafficLightEnum;

public class TrafficLightTest {

	public static void main(String[] args) {;
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf(light + " duration: " + light.getDuration() + " second\n");
        }

	}

}
