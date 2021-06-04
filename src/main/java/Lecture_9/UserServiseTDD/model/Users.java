package Lecture_9.UserServiseTDD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private String name;

    private int age;

    private Integer id;
    private static Integer idCounter = 0;

    public Users(Integer id, String name, int age) {
        this.id = idCounter += 1;
    }
}
