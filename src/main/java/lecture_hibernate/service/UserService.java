package lecture_hibernate.service;

import lecture_hibernate.entity.User;

import java.util.Collection;

public interface UserService {

    User create(String firstName, String lastName, String email);

    Collection<User> findAll();
}
