package com.soumya.MakeMyTrip;

import java.util.ArrayList;



public class FlightDetailsCollection{
	 ArrayList<makeMyTripPojo> flightDetails ;
	    
	    public FlightDetailsCollection() {
	    	flightDetails =  new ArrayList<makeMyTripPojo>();
	              }
	    


	    public void addFlightDetails(makeMyTripPojo mmt) {
	    	flightDetails.add(mmt);
	              }
	    
	    public makeMyTripPojo getFlightByNo(int flightNo) {
            for(makeMyTripPojo mmt: flightDetails) {
                            if(mmt.getFlightNo() == flightNo) {
            }
            return mmt;
}
            throw new RuntimeException("Flight Doesn't Exist");
}

	    public ArrayList<makeMyTripPojo> removeFlightByNo(int flightNo) {     
	    	flightDetails.remove(flightNo);
            return flightDetails;
           }
	    public ArrayList<makeMyTripPojo> updateFlight(int arrivalTime, String destination) {
            for(makeMyTripPojo mmt: flightDetails) {
                            if(mmt.getArrivalTime() == arrivalTime) {
                                            mmt.setDestination(destination);
                                     return flightDetails;
                                           }
                           }
                           throw new RuntimeException("Flight Doesn't Exist");
           }





public static void main(String[] args) {
	FlightDetailsCollection list1 = new FlightDetailsCollection();
     list1.addFlightDetails(new makeMyTripPojo(5500.0,"Bangalore","Belagavi",8.30,"7/10/18",2.0,"Indian"));
     list1.addFlightDetails(new makeMyTripPojo(5100.0,"Bangalore","Belagavi",8.30,"7/10/18",3.0,"Indian"));
     list1.addFlightDetails(new makeMyTripPojo(5300.0,"Bangalore","Belagavi",8.30,"7/10/18",4.0,"Indian"));
  

System.out.println(list1.getFlightByNo(555)); 

for(makeMyTripPojo mmt:list1.removeFlightByNo(1)) {
    System.out.println(mmt);
}
for(makeMyTripPojo mmt:list1.updateFlight(0,"chenai")) {
    System.out.println(mmt);
}
}

}