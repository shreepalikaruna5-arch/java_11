/* create a Book class with the following attributes:
boolId
title
author
Create a paratized constructor to initialize these values.
create a method displayInformation() to display the book datails.
In main(), create two Book objects using the constructor and display their information.
*/
 class Book{
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    public void displayInformation(){
        System.out.println("BookId " + bookId);
        System.out.println("Title" + title);
        System.out.println("Author " + author);
    }

 }
 public class Bookie{
    public static void main(String[] args){
        Book Book1 = new Book(1, "Last Twilight", "JimmySea");
        Book1.displayInformation();    
    }
 }