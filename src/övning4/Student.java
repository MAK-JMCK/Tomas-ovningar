package övning4;

//Skapa en klass Student med attributen name och grade.
//Lägg till metoder för att ändra elevens årskurs och för att skriva ut en presentation av eleven.
//Skapa minst tre Student-objekt i klassen SchoolMain och visa deras information.
//Utöka programmet med en metod som skriver ut alla studenter i ett vii årskurs


public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.grade = grade;
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void getInfo() {
        System.out.println("Namn: " + name + " && Grade = " + grade);

    }

    public void getGrade7() {
        if (grade == 7) {
            System.out.println("Namn: " + name + " && Grade = " + grade);
        }
    }
}




