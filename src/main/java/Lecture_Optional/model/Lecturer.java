package Lecture_Optional.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lecturer {

    private String firstNameLecturer;
    private String lastNameLecturer;
    private Integer ageLecturer;
    private List<Student> studentList;
}
