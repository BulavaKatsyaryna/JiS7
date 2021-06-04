package Lecture_9.UserServiseTDD.servise;

import Lecture_9.UserServiseTDD.model.Users;

import java.util.List;

public interface UsersService {

    Users create (Integer id, String name, int age);

    Users update(Users users);

    List<Users> findAllUsers();

    Users findUsersByUserId(Integer id);

    void deleteUsersById(Integer id);
}
