import java.util.*;

class LibraryItem {
    protected String title;
    protected String author;
    protected int id;
    protected boolean issued;

    public LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.issued = false;
    }

    public void issue() {
        if (!issued) {
            issued = true;
            System.out.println(title + " issued successfully.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnItem() {
        if (issued) {
            issued = false;
            System.out.println(title + " returned successfully.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    public double calculateLateFee(int daysLate) {
        return daysLate * 1.0; // Default fee
    }
}

class Book extends LibraryItem {
    public Book(String title, String author, int id) {
        super(title, author, id);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2.0; // Higher fine for books
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title, String author, int id) {
        super(title, author, id);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1.5;
    }
}

class DVD extends LibraryItem {
    public DVD(String title, String author, int id) {
        super(title, author, id);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 3.0;
    }
}

class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void showItems() {
        for (LibraryItem item : items) {
            System.out.println(item.id + ": " + item.title + " by " + item.author);
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addItem(new Book("Java Basics", "James Gosling", 1));
        lib.addItem(new Magazine("Tech World", "Editorial", 2));
        lib.addItem(new DVD("Inception", "Nolan", 3));

        lib.showItems();

        LibraryItem b1 = new Book("Java Basics", "James Gosling", 1);
        b1.issue();
        System.out.println("Late fee for 5 days: " + b1.calculateLateFee(5));
        b1.returnItem();
    }
}
