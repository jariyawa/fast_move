package data;

import base.Bike;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0]= new Bike("b1",1);
        bikes[1]= new Bike("b2",2);
        bikes[2]=new Bike("b2",3);
        
        
        int i= 0;
        for( i=0;i<bikes.length;i++){
            
        }
        

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code

        return person;
    }

    public static Parcel[] getParcels() {
       // Parcel[] parcels = new Parcel[10];
        // your code
         Parcel[] parcels = new Parcel [8];
        //String[] Parcels = {"Sticker","Boxer gifts","Wiggley Worm","trolls","Ribbon","Cube","Balloon","Springs Slinky","Jigsaw","Puzzle book"};
        parcels[0] =  new Parcel(0.5, ParcelStatus.READY_TO_SHIP);
        parcels[1] = new Parcel(1, ParcelStatus.SHIPPING, new L(100,200));
        parcels[2] = new Parcel(2, ParcelStatus.DELIVERED, new Location(300,500));
        parcels[3] = new Parcel(0.5, ParcelStatus.READY_TO_SHIP);
        parcels[4] = new Parcel(4, ParcelStatus.SHIPPING);
        parcels[5] = new Parcel(1, ParcelStatus.READY_TO_SHIP);
        parcels[6] = new Parcel(2, ParcelStatus.DELIVERED, new Location(400,500));
        parcels[7] = new Parcel(6, ParcelStatus.READY_TO_SHIP, new Location(400,200));
    //   parcels[8] = new Parcel(2.5 ParcelStatus.DELIVERED,new Location(200,100));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
