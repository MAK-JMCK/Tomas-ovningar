package övning2;
//2. Class Dog
//Skapa en klass Dog som har attributen name och age.
//Skapa en metod bark() som skriver ut "Wow" följt av hundens namn.
//I en annan klass (DogMain), skapa minst tre hundar och anropa bark() för alla.
//Utöka sedan Dog med en metod som ökar hundens ålder med 1 år och skriver ut den nya åldern.


public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String bark() {
        return "Wow " + name;
    }

    public int newAge (){
        age += 1;
        return age;
    }
}
