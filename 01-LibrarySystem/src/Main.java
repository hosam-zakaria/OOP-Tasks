public class Main {
    public static void main(String[] args) {
        Library library = new Library("City Central Library");

        Book book1 = new Book("Design Patterns", "Gang of Four", "978-0201633610", true);
        Book book2 = new Book("Clean Code", "Robert Martin", "978-0132350884", true);
        Book book3 = new Book("The Pragmatic Programmer", "Andy Hunt", "978-0135957059", true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Member member1 = new Member("Alice Johnson", "M001");
        Member member2 = new Member("Bob Smith", "M002");

        library.registerMember(member1);
        library.registerMember(member2);

        library.displayAvailableBooks();
        System.out.println("##############################");
        library.lendBook(member1, "978-0201633610");

        System.out.println("##############################");
        library.displayAvailableBooks();
        System.out.println("##############################");

        library.receiveBook(member1, "978-0201633610");

        System.out.println("##############################");
        library.displayAvailableBooks();
    }
}