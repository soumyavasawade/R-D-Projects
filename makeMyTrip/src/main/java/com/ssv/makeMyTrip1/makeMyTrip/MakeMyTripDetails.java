package com.ssv.makeMyTrip1.makeMyTrip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MakeMyTripDetails {
ArrayList<MakeMyTrip> acc1 = new ArrayList();
	
	
	public ArrayList<MakeMyTrip> getAllMakeMyTripList() {
		return acc1;
	
	}
	
	
	public void add(MakeMyTrip f) {
		acc1.add(f);
	}
	
	
	public ArrayList<MakeMyTrip> deleteMakeMyTripByNo(int MakeMyTripNo) {
		  for(MakeMyTrip acc:acc1) {
	        	if(acc.getMakeMyTripNo()==MakeMyTripNo) {
	        		 acc1.remove(MakeMyTripNo);
	        		return acc1;
	        	
	        }
		  }
	        throw new RuntimeException("MakeMyTrip details not found"); 
	        }	
	
	


    public ArrayList<MakeMyTrip> updateMakeMyTrip(int MakeMyTripNo, String airlines) {
    	 for(MakeMyTrip acc:acc1) {
    		 if(acc.getMakeMyTripNo()==MakeMyTripNo) {
              acc.setAirlines(airlines);
              return acc1;
        }
 }

        throw new RuntimeException("Account does not exist");
}


 

 public ArrayList<MakeMyTrip> getAllMakeMyTripdetails() {
        return acc1;
        
 }

 public MakeMyTrip getMakeMyTripByNo(int MakeMyTripNo) {
        for(MakeMyTrip acc:acc1) {
        	if(acc.getMakeMyTripNo()==MakeMyTripNo)
        		return acc;
        	
        }
        throw new RuntimeException("MakeMyTrip details not found"); 
        }
      
 public ArrayList<MakeMyTrip> sortMakeMyTripByName()
 {
	 Collections.sort(acc1,new Comparator<MakeMyTrip>() {
		 
		 
		 public int compare(MakeMyTrip acc1,MakeMyTrip acc2)
		 {
			 return acc1.getAirlines().compareTo(acc2.getAirlines());
			 
	
		 }
	 });
	 
		 return acc1;
		 
 }
	 
 
 public ArrayList<MakeMyTrip> sortMakeMyTripByDuration(String originCity,String DestnCity){
     acc1.sort((trip1, trip2)->trip1.getRouteTime().compareTo(trip2.getRouteTime()));
     return acc1;
            }

public ArrayList<MakeMyTrip> sortMakeMyTripByPrice(String source,String destination){
     acc1.sort((trip1, trip2)->trip1.getCost().compareTo(trip2.getCost()));
     ArrayList<MakeMyTrip> cheapMakeMyTrip=new ArrayList<MakeMyTrip>();
     
     for(MakeMyTrip fly : acc1){
            if(fly.getOrigin().equals(source) && fly.getDestination().equals(destination)){
                  cheapMakeMyTrip.add(fly);
            }
            }
     return cheapMakeMyTrip;
}

     public ArrayList<MakeMyTrip> sortMakeMyTripByTime(String source,String destination){
            acc1.sort((trip1, trip2)->trip1.getRouteTime().compareTo(trip2.getRouteTime()));
            ArrayList<MakeMyTrip> MakeMyTripTime=new ArrayList<MakeMyTrip>();
            
            for(MakeMyTrip fly : acc1){
                  if(fly.getOrigin().equals(source) && fly.getDestination().equals(destination)){
                         MakeMyTripTime.add(fly);
                  }
                  }
            return MakeMyTripTime;
}
     
/*public ArrayList<MakeMyTrip> morningMakeMyTrip(String source,String destination){
     ArrayList<MakeMyTrip> morningTime=new ArrayList<MakeMyTrip>();
     
     for(MakeMyTrip fly : acc1){
            if(fly.getArrivalTime()<12 && fly.getDepartureTime()<12)
                  morningTime.add(fly);
     }
     return morningTime;
}
}

*/

public static void main(String[] args)
{
	
	
MakeMyTripDetails a=new MakeMyTripDetails();

a.add(new MakeMyTrip("Jet1","Bangalore","Belagavi","8:00","9:00","2:00","3200"));

a.add(new MakeMyTrip("Air India","Belagavi","Delhi","12:00","4:00","4:00","5000"));
a.add(new MakeMyTrip("Air India1","Bangalore","Belagavi","9:00","12:00","3:00","4500"));
a.add(new MakeMyTrip("Air India2","mysore","New Belagavi","15:00","18:00","3:00","5000"));



for(MakeMyTrip acc:a.getAllMakeMyTripdetails()) {
System.out.println(acc);
}

// a.deleteAccountByID(1);
System.out.println(a.getMakeMyTripByNo(1));
System.out.println("--------------------------");
for(MakeMyTrip acc:a.updateMakeMyTrip(2,"Jet-Air")) {
	System.out.println(acc);

	}



for(MakeMyTrip acc:a.deleteMakeMyTripByNo(3)) {
	System.out.println(acc);

	}




}
}