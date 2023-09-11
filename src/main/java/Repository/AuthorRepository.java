package Repository;

import Entity.Author;

import java.sql.*;

public class AuthorRepository {
    Connection connection;

    public AuthorRepository(Connection connection) {

        this.connection = connection;
    }

    public void save(Author author) throws SQLException {
        String sql = "INSERT INTO authors(firstname, lastname, age) values (?,?,?)";
        PreparedStatement preparedStatement =
                connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,author.getFirstname());
        preparedStatement.setString(2,author.getLastname());
        preparedStatement.setInt(3, author.getAge());
        preparedStatement.executeUpdate();
        if (preparedStatement.getGeneratedKeys().next()){
            author.setId(preparedStatement.getGeneratedKeys().getInt(1));
        }
    }

    public Author load(long id) throws SQLException {
        String sql = "SELECT * FROM users WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Author author = new Author();
        if (resultSet.next()){
            author.setId(resultSet.getLong(1));
            author.setFirstname(resultSet.getString(2));
            author.setLastname(resultSet.getString(3));
            author.setAge(resultSet.getInt(4));
        }
        return author;
    }

}
