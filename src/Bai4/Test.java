package Bai4;

public class Test {
    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "J.K. Rowling", "Bloomsbury");
        System.out.println(book.getInfo());

        Book.FictionBook fictionBook = new Book.FictionBook("Lord of the Rings", "Tolkien", "H.M.H", "Fantasy");
        System.out.println(fictionBook.getInfo());

        Book.NonFictionBook nonFictionBook = new Book.NonFictionBook("All in Her Head", "Elizabeth Comen", "........", "Life");
        System.out.println(nonFictionBook.getInfo());

        Book.ScienceBook scienceBook = new Book.ScienceBook("A Brief History of Time", "Stephen Hawking", "Bantam Books", "Cosmology", "Physics");
        System.out.println(scienceBook.getInfo());
    }
}
