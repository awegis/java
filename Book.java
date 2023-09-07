public class Book {
    private String author;
    private String book_name;
    private int year;
    public Book() {
    };
    public String get_author() {
        return author;
    }
    public String get_book_name() {
        return book_name;
    }
    public int get_year() {
        return year;
    }
    public void set_author(String a) {
        this.author = a;
    }
    public void set_book_name(String a) {
        this.book_name = a;
    }
    public void set_year(int a) {
        this.year = a;
    }
}
