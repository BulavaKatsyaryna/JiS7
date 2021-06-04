package Lecture_9.UserServiseTDD.validator;

import lombok.SneakyThrows;

import java.util.Objects;

public class UsersValidator {

    @SneakyThrows
    public void validateUsersAge(Integer age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be equals zero or less");
        }
    }

    public void validateUsersName(String name) {
        if (Objects.isNull(name) || Objects.equals(name, "") || Objects.equals(name, " ")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
}
