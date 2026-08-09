package Aggregation;

// Aggregation simply means existence of one object in another object
// in this case, book object is in library object , even if library object is deleted, "book" object stays

class Book{

    String title;
    int pages;

    Book(String title, int pages){

        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        
        return this.title + " (" + this.pages + " ) pages"; 
    }
}

class Library{

    String name; // name of library
    int year; // year it was established
    Book[] books; // an array of "books"

    Library(String name, int year, Book[] books){

        this.name = name;
        this.year = year;
        this.books = books;
    }

    void libraryInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("**Available Books**");

        for(Book book : books)
        {
            System.out.println(book.displayInfo());
        }
        System.out.println("*******************");
    }

}

public class Main {
    public static void main(String[] args) {
        
        // Aggregation : Represents a "has-a" relationship between objects .
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.
     
        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);
        Book book4 = new Book("Book4", 400);
        Book book5 = new Book("Book5", 500);

        Book[] books = {book1, book2, book3, book4, book5};

        // librart object
        Library library = new Library("library1", 2007, books);

        library.libraryInfo();

    }
}
