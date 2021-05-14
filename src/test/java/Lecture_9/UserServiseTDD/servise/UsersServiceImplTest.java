package Lecture_9.UserServiseTDD.servise;

import Lecture_9.UserServiseTDD.model.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersServiceImplTest {

    private UsersServiceImpl usersService;

    static int counter = 0;

    @BeforeEach
    void setUp() {
        usersService = new UsersServiceImpl();
    }

    @Test
    void getUsersWithAgeLessThanZero_checkCreateUsers_IllegalStateExeption() {
        assertThrows(IllegalArgumentException.class, this::getUsersWithAgeLessThanZero);
    }

    @Test
    void getFullDefinedUsers_checkCreateUsers_fullDefinedUsers() {
        var createdUsers = usersService.create(1, "Katya", 26);
        assertEquals(getFullDefinedUsers(), createdUsers, "Expected null but i've got " + createdUsers);
    }

    @Test
    void getUsersWithEmptyName_checkCreateUsers_IllegalArgumentException() {

    }

    public Users getFullDefinedUsers() {
        return new Users("Katya",26, 1);
    }

    public Users getUsersWithAgeLessThanZero() {
        return usersService.create(1, "Katya", - 26);
    }

    public Users getUsersWithEmptyName() {
        return usersService.create(1, "", 26);
    }

    public Users getUsersWithSNullName() {
        return usersService.create(1, null, 26);
    }
}