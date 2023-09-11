package service;

import entity.Author;
import entity.Book;
import repository.AuthorRepository;
import repository.BookRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class BookService {
    private  Connection connection;
    private BookRepository bookRepository;

    public BookService(Connection connection) {
        this.connection = connection;
        this.bookRepository = new BookRepository(connection);
    }
    public void addBook(String title, Long authorId, int publishedYear) throws SQLException {
        AuthorRepository authorRepository = new AuthorRepository(connection);
        Author author = authorRepository.load(authorId);
        Book book = new Book();
        book.setTitle(title);
        book.setPublishedYear(publishedYear);
        book.setAuthor(author);
        bookRepository.save(book);
    }
}
