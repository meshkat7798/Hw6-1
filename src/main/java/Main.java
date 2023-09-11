import repository.BookRepository;
import service.AuthorService;
import service.BookService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","meshkat77");
        AuthorService authorService = new AuthorService(connection);
        BookService bookService = new BookService(connection);
//        authorService.register("samaneh" , "movahedi" , 20);
//        authorService.register("sahar" , "gholami",17);
//        authorService.register("sama", "boshagh",21);
//        authorService.register("meshkat", "hashemian" , 24);
//        bookService.addBook("cheshmhayash" , 1L,1390);
//        bookService.addBook("ou" , 2L, 1394);
//        bookService.addBook("dasht" , 3L,  1398);
//        bookService.addBook("man" , 4L, 1400);

    }
}
