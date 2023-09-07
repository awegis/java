public class BookShelf {
    public int i = 0;
    public BookShelf() {};
    public Book[] arr;
    public void set_book(Book a) {
            arr[i] = a;
            i++;
    }
    public void get_shelf() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Автор: " + (arr[i].get_author()) +
                    "\nНазвание: " + (arr[i].get_book_name()) + "\nГод написания: " + (arr[i].get_year()));
        }
    }

    public String get_earlier_book() {
        int early = 2023;
        String early_name = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].get_year() < early) {
                early = arr[i].get_year();
                early_name = arr[i].get_book_name();
            }
        }
        return early_name;
    }

    public String get_late_book() {
        int late = 1900;
        String late_name = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].get_year() > late) {
                late = arr[i].get_year();
                late_name = arr[i].get_book_name();
            }
        }
        return late_name;
    }

    public void sort() {
        int i = 0, j = 0;
        Book temp;

        while (i < arr.length - 1) {
            j = i + 1;
            while (j < arr.length) {
                if (arr[i].get_year() > arr[j].get_year()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }
    }


}
