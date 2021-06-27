package Lecture_JDBC_DB_CRUD.Service;

import Lecture_JDBC_DB_CRUD.User.Status;
import Lecture_JDBC_DB_CRUD.User.User;

import java.sql.SQLException;
import java.util.Collection;

public interface UserService {

    User create(String firstname, String lastname, Status status, String email) throws SQLException, ClassNotFoundException;

    User findById(Integer id) throws SQLException, ClassNotFoundException;

    User findBySigns(String firstSign, String lastSign) throws SQLException, ClassNotFoundException;

    User delete(Status status) throws SQLException, ClassNotFoundException;

    Collection<User> getWholeDB() throws SQLException, ClassNotFoundException;

    User refreshEntity(User user) throws SQLException, ClassNotFoundException;
}
