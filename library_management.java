import java.util.*;

// Book class
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isAvailable ? " (Available)" : " (Borrowed)");
    }
}

// User class
abstract class User {
    protected String name;
    protected List<Book> borrowedBooks;
    protected int maxBooks;
    protected int overdueFineRate;

    public User(String name, int maxBooks, int overdueFineRate) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        this.maxBooks = maxBooks;
        this.overdueFineRate = overdueFineRate;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() >= maxBooks) {
            System.out.println(name + " cannot borrow more than " + maxBooks + " books.");
            return false;
        }
        borrowedBooks.add(book);
        book.setAvailable(false);
        return true;
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
    }

    public abstract double calculateFine(int overdueDays);

    @Override
    public String toString() {
        return name + " (" + borrowedBooks.size() + " books borrowed)";
    }
}

// Student class
class Student extends User {
    public Student(String name) {
        super(name, 3, 10); // Max 3 books, 10 currency fine per day
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * overdueFineRate;
    }
}

// Teacher class
class Teacher extends User {
    public Teacher(String name) {
        super(name, 5, 5); // Max 5 books, 5 currency fine per day
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * overdueFineRate;
    }
}

// Library class
class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void searchBook(String keyword) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) || 
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available or not found.");
    }

    public void returnBook(User user, String title, int overdueDays) {
        for (Book book : user.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                user.returnBook(book);
                double fine = user.calculateFine(overdueDays);
                System.out.println(user.getName() + " returned " + book.getTitle() + ". Fine: " + fine);
                return;
            }
        }
        System.out.println("Book not found in user's borrowed list.");
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main class to run the system
public class library_management {

    public static void main(String[] args) {
        Library library = new Library();
        
        // Add some books to the library
        library.addBook(new Book("Java Programming", "James Gosling"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        // Add users
        User student1 = new Student("Alice");
        User teacher1 = new Teacher("Mr. Smith");

        library.addUser(student1);
        library.addUser(teacher1);

        // Simulate borrowing and returning books
        System.out.println("\n--- Available Books ---");
        library.displayBooks();

        System.out.println("\n--- Borrowing Books ---");
        library.borrowBook(student1, "Java Programming");
        library.borrowBook(teacher1, "Clean Code");

        System.out.println("\n--- Available Books After Borrowing ---");
        library.displayBooks();

        System.out.println("\n--- Returning Books with Overdue Fine ---");
        library.returnBook(student1, "Java Programming", 5); // 5 days overdue
        library.returnBook(teacher1, "Clean Code", 3);       // 3 days overdue

        System.out.println("\n--- Available Books After Returning ---");
        library.displayBooks();
    }
}
