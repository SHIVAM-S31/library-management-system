class Library {
    private int x = 5; // aise hi liye hai 66 file samajane ke liye
    String[] books;
    int noofbooks;

    Library() {
        this.books = new String[100];
        this.noofbooks = 0;
    }

    void addbook(String book) {
        this.books[noofbooks] = book;
        noofbooks++;
        System.out.println(book + "has been added");
    }

    void showavailablebooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }

    void issuebook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("the book hais been isuued");
                this.books[i] = null;
                return;
            } else {
                System.out.println("This book does not exist");
            }
        }
    }

    void returnbook(String book) {
        addbook(book);
    }
}

public class cwh_61_online_library {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addbook("Atomic Habits");
        lib.addbook("algorith");
        lib.addbook("Java");
        lib.showavailablebooks();
        lib.issuebook("algorith");
        lib.showavailablebooks();
        lib.returnbook("algorith");
        lib.returnbook("c++");
        lib.showavailablebooks();
    }

}
