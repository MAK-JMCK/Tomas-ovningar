package övning4;

public class SchoolMain {
    static void main(String[] args) {
        Student elev1 = new Student("Amjad", 8);
        Student elev2 = new Student("Julia", 7);
        Student elev3 = new Student("ARon", 9);

        elev1.setGrade(6);
        elev1.getInfo();
        elev2.getInfo();
        elev3.getInfo();

        System.out.println("Dessa personer går i årskurs 7 ");
        elev1.getGrade7();
        elev2.getGrade7();
        elev3.getGrade7();

    }
}
