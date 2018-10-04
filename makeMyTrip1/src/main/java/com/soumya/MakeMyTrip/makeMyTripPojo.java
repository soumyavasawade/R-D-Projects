package com.soumya.MakeMyTrip;

public class makeMyTripPojo {
	int flightNo;
	double flightCost;
	String originCity;
	String destination;
	double arrivalTime;
	String departure;
	double rootTime;
	String airLine;
	static int autoAccountNoGen;
	public makeMyTripPojo(double flightCost, String originCity, String destination, double arrivalTime,
			String departure, double rootTime, String airLine) {
		super();
		
		this.flightCost = flightCost;
		this.originCity = originCity;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.departure = departure;
		this.rootTime = rootTime;
		this.airLine = airLine;
	}

	public int getFlightNo() {
		return flightNo;
	}


	public double getFlightCost() {
		return flightCost;
	}

	public void setFlightCost(double flightCost) {
		this.flightCost = flightCost;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(double arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public double getRootTime() {
		return rootTime;
	}

	public void setRootTime(double rootTime) {
		this.rootTime = rootTime;
	}

	public String getAirLine() {
		return airLine;
	}

	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}

	@Override
	public String toString() {
		return "makeMyTripPojo [flightNo=" + flightNo + ", flightCost=" + flightCost + ", originCity=" + originCity
				+ ", destination=" + destination + ", arrivalTime=" + arrivalTime + ", departure=" + departure
				+ ", rootTime=" + rootTime + ", airLine=" + airLine + "]";
	}
	
	
}
