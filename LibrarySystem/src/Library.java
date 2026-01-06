import java.util.ArrayList;

public class Library {
    private String name;
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    public Library(String n) {
        this.name = n;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void lendBook(Member member, String isbn) {
        Book foundBook = null;
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                foundBook = b;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("Book not found");
            return;
        }

        if (foundBook.isAvailable()) {
            member.borrowBook(foundBook);
            foundBook.borrow();
            System.out.println("Book lent successfully");
        } else {
            System.out.println("Book is already borrowed");
        }
    }


    public void receiveBook(Member member, String isbn) {
        Book foundBook = null;

        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                foundBook = b;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("Book not found");
            return;
        }

        member.returnBook(foundBook);
        foundBook.returnBook();

        System.out.println("Book returned successfully");
    }

    public void displayAvailableBooks() {

        System.out.println("Available Books:");

        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println(b.getInfo());
            }
        }
    }

}