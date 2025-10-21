package övning1;

public class CarShowroomMain {
    static void main(String[] args) {
        Car car1 = new Car("BMW", "i4", 2024);
        Car car2 = new Car("Volvo", "XC60", 2025);
        Car car3 = new Car("Audi", "A5", 2026);

        System.out.println(car1.getBilInfo());
        System.out.println(car2.getBilInfo());
        System.out.println(car3.getBilInfo());
        Car nyaste = Car.nyasteBilen(car1, car2, car3);
        System.out.println("Nyaste bilen är: " + nyaste.getBilInfo());
    }


}
