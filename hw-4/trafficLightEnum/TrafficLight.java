package com.trafficLightEnum;

public enum TrafficLight {
	RED(52),
	YELLOW(2),
	GREEN(10);
		
	private final int duration;
		
	TrafficLight(int duration) {
		this.duration = duration;
	}
		
	public int getDuration() {
		return duration;
	}
}
