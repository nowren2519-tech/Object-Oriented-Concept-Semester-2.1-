class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String describe() {
        return title + " by " + author;
    }
}

public class BookInfo {
    public static void main(String[] args) {

        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen");

        System.out.println(book1.describe());
        System.out.println(book2.describe());
        System.out.println(book3.describe());
    }
}