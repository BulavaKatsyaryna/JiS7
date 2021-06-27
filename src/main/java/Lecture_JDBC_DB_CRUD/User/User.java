package Lecture_JDBC_DB_CRUD.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Status status;
//    private Collection<Address> addresses;

    public User(String firstName, String lastName, Status status, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.email = email;
    }
}
