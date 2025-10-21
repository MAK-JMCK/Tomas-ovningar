package övning5;

public class LibraryApp {
    static void main(String[] args) {
        Book bok1 = new Book("Gränsöverskridaren", "Viveca Sten", 400);
        Book bok2 = new Book("Lucia är död", "Katarina Wennstam", 350);
        Book bok3 = new Book("Den yttersta hemligheten", "Dan Brown", 450);

        bok1.pagesRead(50);
        System.out.println(" ");
        bok2.pagesRead(350);
        System.out.println(" ");
        bok3.pagesRead(451);
    }
}
