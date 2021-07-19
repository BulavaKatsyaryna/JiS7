package Lecture_Optional.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String firstNameStudent;
    private String lastNameStudent;
    private Integer ageStudent;
}
