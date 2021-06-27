package Lecture_JDBC_DB_CRUD.Service;

import Lecture_JDBC_DB_CRUD.BDConnector.PostgresConnector;
import Lecture_JDBC_DB_CRUD.User.Status;
import Lecture_JDBC_DB_CRUD.User.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class UserServiceImpl implements UserService {

    @Override
    public User create(String firstName, String lastName, Status status, String email) throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();
        String sql = "INSERT INTO \"user\" (first_name, last_name, status, email) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setString(3, status.name());
        statement.setString(4, email);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("User added to database");
        }
        statement.close();
        connection.close();
        return new User(firstName, lastName, status, email);
    }

    @Override
    public User findById(Integer id) throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();
        String sql = "SELECT * FROM \"user\" WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();

        User user = new User();

        while (resultSet.next()) {
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString("last_name"));
            user.setEmail(resultSet.getString("email"));
            user.setStatus(Status.valueOf(resultSet.getString("status")));
        }
        resultSet.close();
        statement.close();
        statement.getConnection().close();

        return user;
    }

    @Override
    public User findBySigns(String firstSign, String lastSign) throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();
        String sql = "SELECT * FROM \"user\" WHERE first_name LIKE ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, firstSign + "%" + lastSign);
        ResultSet resultSet = statement.executeQuery();

        User user = new User();

        while (resultSet.next()) {
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString("last_name"));
            user.setEmail(resultSet.getString("email"));
            user.setStatus(Status.valueOf(resultSet.getString("status")));
        }
        resultSet.close();
        statement.close();
        statement.getConnection().close();

        return user;
    }

    @Override
    public User delete(Status status) throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();
        String sql = "DELETE FROM \"user\" WHERE status = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, status.name());
        ResultSet resultSet = statement.executeQuery();

        User user = new User();
        System.out.println("User deleted");

        resultSet.close();
        statement.close();
        statement.getConnection().close();

        return user;
    }

    @Override
    public Collection<User> getWholeDB() throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();
        String sql = "SELECT * FROM \"user\"";
        PreparedStatement statement = connection.prepareStatement(sql);

        Collection<User> getWholeDB = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery();

        User user = new User();

        while (resultSet.next()) {
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString("last_name"));
            user.setEmail(resultSet.getString("email"));
            user.setStatus(Status.valueOf(resultSet.getString("status")));
        }
        getWholeDB.forEach(System.out::println);

        resultSet.close();
        statement.close();
        statement.getConnection().close();

        return getWholeDB;
    }

    @Override
    public User refreshEntity(User user) throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();
        String sql = "UPDATE \"user\" SET id = ?, first_name = ?, last_name = ?, status = ?, email = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, String.valueOf(user.getId()));
        statement.setString(2, user.getFirstName());
        statement.setString(3, user.getLastName());
        statement.setString(4, String.valueOf(user.getStatus()));
        statement.setString(5, user.getEmail());

        int row = statement.executeUpdate();
        if (row > 0) {
            System.out.println("The user is updated");
        }
        statement.close();
        connection.close();

        return user;
    }
}
