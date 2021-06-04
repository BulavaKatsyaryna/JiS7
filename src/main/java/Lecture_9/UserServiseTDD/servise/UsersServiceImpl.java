package Lecture_9.UserServiseTDD.servise;

import Lecture_9.UserServiseTDD.model.Users;
import Lecture_9.UserServiseTDD.validator.UsersValidator;

import java.util.List;

public class UsersServiceImpl implements UsersService {

    private final UsersValidator validator = new UsersValidator();

    @Override
    public Users create(Integer id, String name, int age) {
        validator.validateUsersAge(age);
        validator.validateUsersName(name);
        return new Users(id, name, age);
    }

    @Override
    public Users update(Users users) {
        return null;
    }

    @Override
    public List<Users> findAllUsers() {
        return null;
    }

    @Override
    public Users findUsersByUserId(Integer id) {
        return null;
    }

    @Override
    public void deleteUsersById(Integer id) {

    }
}
