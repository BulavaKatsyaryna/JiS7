package Lecture_JDBC_DB_CRUD.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Integer id;
    private String city;
    private String street;
    private Integer home;
    private Integer apartment;
}