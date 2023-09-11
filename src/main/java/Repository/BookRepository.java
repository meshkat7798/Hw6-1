package Repository;

import Entity.Author;
import Entity.Book;

import java.sql.*;

public class BookRepository {
    Connection connection;

    public BookRepository(Connection connection) {

        this.connection = connection;
    }
    public void save(Book book) throws SQLException {
        String sql = "INSERT INTO books(title, author, published_year) values (?,?,?)";
        PreparedStatement preparedStatement =
                connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,book.getTitle());
        preparedStatement.setObject(2,book.getAuthor());
        preparedStatement.setInt(3, book.getPublishedYear());
        preparedStatement.executeUpdate();
        if (preparedStatement.getGeneratedKeys().next()){
            book.setId(preparedStatement.getGeneratedKeys().getInt(1));
        }
    }

    public Book load(long id) throws SQLException {
        String sql = "SELECT * FROM books WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Book book = new Book();
        if (resultSet.next()){
            book.setId(resultSet.getLong(1));
            book.setTitle(resultSet.getString(2));
            book.setAuthor((Author) resultSet.getObject(3));
            book.setPublishedYear(resultSet.getInt(4));
        }
        return book;
    }

    public void delete(Book book) throws SQLException {
        String sql = "DELETE FROM books where id=? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1,book.getId());
        int result = preparedStatement.executeUpdate();
        if (result==1){
            System.out.println("book deleted");
        }

    }
}
