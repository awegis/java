import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        BookShelf shelf = new BookShelf();
        System.out.println("Введите количество книг на полке: ");
       	shelf.arr = new Book[Integer.parseInt(x.nextLine().trim())]; 
        int i = 0;
        while(i < shelf.arr.length){
            Book cur_book = new Book();
            System.out.println("Введите автора книги:");
            cur_book.set_author(x.nextLine());
            System.out.println("Автор: " + cur_book.get_author());
            System.out.println("Введите название книги: ");
            cur_book.set_book_name(x.nextLine());
            System.out.println("Название: " + cur_book.get_book_name());
            System.out.println("Введите год написания книги: ");
            cur_book.set_year(Integer.parseInt(x.nextLine()));
            System.out.println("Год написания: " + cur_book.get_year());
            shelf.set_book(cur_book);
            i++;
        }
        System.out.println("Книга с самым ранним сроком издания: " + shelf.get_earlier_book());
        System.out.println("Книга с самым поздним сроком издания: " + shelf.get_late_book());
        shelf.sort();
        System.out.println("Сортируем книги...");
        System.out.println("Книжная полка: ");
        shelf.get_shelf();}

    }
