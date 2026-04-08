import java.util.ArrayList;
import java.util.Scanner;

// This is the main class
public class LibraryManagementSystem {

    // Book class (inner class, not public)
    static class Book {
        String title;
        String author;
        String isbn;

        Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
        }
    }

    // List to store books
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Adding some sample books
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084"));
        books.add(new Book("1984", "George Orwell", "978-0451524935"));

        System.out.println("===== Library Management System =====");

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display all books");
            System.out.println("2. Add a new book");
            System.out.println("3. Remove a book by ISBN");
            System.out.println("4. Search a book by title");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    addBook(scanner);
                    break;
                case 3:
                    removeBookByIsbn(scanner);
                    break;
                case 4:
                    searchBookByTitle(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    // Display all books
    static void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nList of books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    // Add a new book
    static void addBook(Scanner scanner) {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        // Check if ISBN already exists
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                System.out.println("Book with this ISBN already exists.");
                return;
            }
        }

        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully.");
    }

    // Remove a book by ISBN
    static void removeBookByIsbn(Scanner scanner) {
        System.out.print("Enter ISBN of the book to remove: ");
        String isbn = scanner.nextLine();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isbn.equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // Search for a book by title (case-insensitive)
    static void searchBookByTitle(Scanner scanner) {
        System.out.print("Enter title to search: ");
        String title = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with title \"" + title + "\".");
        }
    }
}