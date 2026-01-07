public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable ;

    // Constructor
    public Book(String t, String a, String i, boolean av) {
        this.title = t;
        this.author = a;
        this.isbn = i;
        this.isAvailable = av;
    }

    // Method

    // Return String ALL Details Any Book
    public String getInfo() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "ID: " + isbn + "\n" +
                "Available: " + isAvailable + "\n" ;
    }

    ///  Marks the book as borrowed (not available)
    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }

        System.out.println("Book is already borrowed");
        return false;
    }

    ///  Marks the book as returned (available)
    public void returnBook() {
        if (isAvailable == false){
            isAvailable = true;
        }
    }

    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
