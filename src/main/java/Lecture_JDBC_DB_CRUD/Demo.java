package Lecture_JDBC_DB_CRUD;

import Lecture_JDBC_DB_CRUD.Service.UserService;
import Lecture_JDBC_DB_CRUD.Service.UserServiceImpl;
import Lecture_JDBC_DB_CRUD.User.Status;
import Lecture_JDBC_DB_CRUD.User.User;

import java.sql.SQLException;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();

        User user = userService.create("Raisa", "Tolstaya", Status.RODSTVENNIK, "Babushka@gmail.com");
        System.out.println(user.toString());

        User user = userService.findById(2);
        System.out.println(user.toString());

        User user = userService.findBySigns("A", "a");
        System.out.println(user.toString());

        User user = userService.delete(Status.valueOf("DRYG"));

        Collection<User> getWholeDB = userService.getWholeDB();
        System.out.println(getWholeDB);
    }
}
