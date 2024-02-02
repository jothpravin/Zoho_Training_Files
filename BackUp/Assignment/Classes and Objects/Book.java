public class Book {
    private String title;
    private String author;
    private String publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public static void main(String[] args) {
        Book book = new Book("Rich dad Poor dad", "nolan", "pravin");
        
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Publisher: " + book.getPublisher());

        book.setPublisher("Vintage Books");
        System.out.println("Updated Book Publisher: " + book.getPublisher());
    }
}

