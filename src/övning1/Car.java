package övning1;
//1. Class Car
//Skapa en klass Car som har attributen brand, model och year.
//Skapa en metod som skriver ut all information om bilen.
//Skapa minst tre olika Car-objekt i en annan klass (CarShowroomMain) och anropa metoden för att visa informationen.
//Utöka sedan Car med en metod som jämför bilarnas årsmodell och skriver ut vilken som är nyast.


public class Car {
    private String brand;
    private String model;
    private int year;


    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBilInfo() {
        return brand + " " + model + " " + year;
    }

    public static Car nyasteBilen(Car car1, Car car2, Car car3) {
        if (car1.getYear() >= car2.getYear() && car1.getYear() >= car3.getYear()) {
            return car1;
        } else if (car2.getYear() >= car1.getYear() && car2.getYear() >= car3.getYear()) {
            return car2;
        } else {
            return car3;
        }
    }

    public int getYear() {
        return year;
    }


}