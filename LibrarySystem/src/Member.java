import java.util.ArrayList;
public class Member {
    private String name;
    private String memberId;
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public Member(String n, String m) {
        this.name = n;
        this.memberId = m;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getInfo() {
        String info = "Member Name: " + name + "\n";
        info += "Member ID: " + memberId + "\n";

        if (borrowedBooks.size() == 0) {
            info += "Borrowed Books: None";
        }else {
            info += "Borrowed Books: ";
            for (int i = 0; i < borrowedBooks.size() ;i++){
                info += borrowedBooks.get(i).getTitle(); // Encapsulation
                if (i != borrowedBooks.size() - 1) {
                    info += ", ";
                }
            }
        }
        return info;
    }

    public void borrowBook(Book book) {
        if (book.borrow()) {
            borrowedBooks.add(book);
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is not available");
        }
    }
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("This member did not borrow this book");
        }
    }
}
