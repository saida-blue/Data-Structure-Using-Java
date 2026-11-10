class Example2_Book {
    String title;
    String author;
    int pages;

    Example2_Book(String bTitle, String bAuthor, int bPages) {
        title = bTitle;
        author = bAuthor;
        pages = bPages;
    }

    void describe() {
        System.out.println("\"" + title + "\" by " + author + " - " + pages + " pages");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Example2_Book b1 = new Example2_Book("Clean Code", "Robert Martin", 464);
        Example2_Book b2 = new Example2_Book("Java Software Structures", "Lewis & Chase", 592);

        b1.describe();
        b2.describe();
    }
}
