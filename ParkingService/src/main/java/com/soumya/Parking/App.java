package com.soumya.Parking;

import java.util.Map;

public class App {
public static void main(String[] args) {
Park park=new Park();
OwnerDetails owner=new OwnerDetails("soumya", "1564361", "11:11");
park.addCar(new OwnerDetails("soumya","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya1","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya2","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya4","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya3","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya5","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya6","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya7","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya8","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumya9","7204715612", "11:00"));
park.addCar(new OwnerDetails("soumyajain","7204715612", "11:00"));
park.addCar(owner);
park.getAllCars();
for(Map.Entry e
: park.getAllCars() ) {
System.out.println(e.getKey()+" " + e.getValue());
}
System.out.println(park.getCarById(owner.getId()));
park.getAllCars();
for(Map.Entry e
: park.getAllCars() ) {
System.out.println(e.getKey()+" " + e.getValue());
}
}

}


