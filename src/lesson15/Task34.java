package lesson15;

import java.io.*;

class Book implements Serializable {
    private String author;
    private String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
public class Task34 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final int NUMBER_OF_BOOKS = 4;
        Book[] books = new Book[NUMBER_OF_BOOKS];
        books[0] = new Book("William Shakspire", "Romeo and Juliet");
        books[1] = new Book("Лев Толстой", "Война и Мир");
        books[2] = new Book("Александр Дюма", "Три мущкетера");
        books[3] = new Book("Федор Достоевский", "Преступление и наказание");


        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("books.out"));
        for (Book book : books)
            os.writeObject(book);
        os.close();


        ObjectInputStream is = new ObjectInputStream(new FileInputStream("books.out"));
        for (int i = 0; i < NUMBER_OF_BOOKS; i++) {
            Book book = (Book)is.readObject();
            System.out.println(book.getAuthor() + "-" + book.getName());
        }

    }
}
