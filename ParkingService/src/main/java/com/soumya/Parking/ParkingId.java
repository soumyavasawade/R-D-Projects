package com.soumya.Parking;

public class ParkingId {
	int floor;
int section;
int compartment;

public ParkingId(int compartment, int section,int floor) {
super();
this.compartment = compartment;
this.section = section;
this.floor = floor;
}
public int getFloor() {
return floor;
}
public void setFloor(int floor) {
this.floor = floor;
}
public int getSection() {
return section;
}
public void setSection(int section) {
this.section = section;
}
public int getCompartment() {
return compartment;
}
public void setCompartment(int compartment) {
this.compartment = compartment;
}
@Override
public String toString() {
	return "ParkingId [floor=" + floor + ", section=" + section + ", compartment=" + compartment + "]";
}
}














