package övning5;

//Skapa en klass Book med attributen title, author och pages.
//Lägg till en metod read(int pagesRead) som ökar antalet sidor som användaren har läst.
//Om användaren försöker läsa fler sidor än boken har, skriv ut ett felmeddelande.
//Testa klassen i LibraryApp genom att skapa minst två olika böcker och simulera att du läser olika mängder sidor i varje bok.


public class Book {
    private String title, author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.author = author;
        this.pages = pages;
        this.title = title;
    }

    public int pagesRead(int readPages) {
        if (readPages <= pages) {
            pages -= readPages;
            System.out.println(pages + " kvar att läsa");
            return pages ;
        } else {
            System.out.println(" Boken innhåller inte så många sidor");
            return pages;
        }
    }

}
