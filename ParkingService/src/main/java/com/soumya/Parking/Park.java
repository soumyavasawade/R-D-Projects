package com.soumya.Parking;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Park {
private static int compartment=1;
private static int section=1;
private static int floor=1;

Map<ParkingId,OwnerDetails> cars;

public Park() {
cars=new HashMap<>();
}
public void addCar(OwnerDetails car)

    {     

           if(compartment>10)

           {

                  section++;

                  compartment=1;

                  if(section>4)

                  {

                        floor++;

                        section=1;

                        compartment=1;

                  }

           }

        ParkingId key=new ParkingId(compartment,section,floor);

       

           cars.put(key, car);

           compartment++;

          

           car.setId(key);

    }
public Set<Map.Entry<ParkingId,OwnerDetails>> getAllCars(){
  return cars.entrySet();
  
}
public OwnerDetails getCarById(ParkingId id) {
return cars.get(id);
}
public OwnerDetails returned_value(ParkingId id){
	return cars.remove(5); 
}

}





