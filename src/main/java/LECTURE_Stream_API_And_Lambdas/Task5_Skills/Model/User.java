package LECTURE_Stream_API_And_Lambdas.Task5_Skills.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private Integer id;
    private String name;
    private List<SkillEnum> skills;

    public User(Integer id, String name, SkillEnum skill) {
    }
}