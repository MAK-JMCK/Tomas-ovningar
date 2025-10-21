package övning2;

public class DogMain {
    static void main(String[] args) {
        Dog dog1 = new Dog("Milo", 10);
        Dog dog2 = new Dog("Maxi", 9);
        Dog dog3 = new Dog("Sello", 8);

        System.out.println(dog1.bark() + dog1.newAge());
        System.out.println(dog2.bark() + dog2.newAge());
        System.out.println(dog3.bark() + dog3.newAge());

    }
}
