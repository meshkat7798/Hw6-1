package service;

import entity.Author;
import repository.AuthorRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class AuthorService {
   private Connection connection ;
private AuthorRepository authorRepository;

    public AuthorService(Connection connection) {
        this.connection = connection;
        this.authorRepository = new AuthorRepository(connection);
    }

    public void register(String firstname, String lastname, int age) throws SQLException {
        Author author = new Author(firstname,lastname,age);
        authorRepository.save(author);
    }

}
