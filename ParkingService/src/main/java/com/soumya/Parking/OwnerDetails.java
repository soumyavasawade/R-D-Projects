package com.soumya.Parking;

public class OwnerDetails  {
	
		String OwnerName;
		String OwnerNumber;
		String Time;
		ParkingId id;
		public ParkingId getId() {
		return id;
		}
		public void setId(ParkingId id) {
		this.id = id;
		}
		@Override
		public String toString() {
		return "OwnerDetails [OwnerName=" + OwnerName + ", OwnerNumber=" + OwnerNumber + ", Time=" + Time + "]";
		}
		public OwnerDetails(String ownerName, String ownerNumber, String time) {
		super();
		OwnerName = ownerName;
		OwnerNumber = ownerNumber;
		Time = time;
		}
		public String getOwnerName() {
		return OwnerName;
		}
		public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
		}
		public String getOwnerNumber() {
		return OwnerNumber;
		}
		public void setOwnerNumber(String ownerNumber) {
		OwnerNumber = ownerNumber;
		}
		public String getTime() {
		return Time;
		}
		public void setTime(String time) {
		Time = time;
		}
		}


