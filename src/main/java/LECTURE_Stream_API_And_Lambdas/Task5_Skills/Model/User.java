package LECTURE_Stream_API_And_Lambdas.Task5_Skills.Model;

import edu.emory.mathcs.backport.java.util.Arrays;
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
    private List<SkillAndPercentage> skills;

    public User(int id, String name, SkillAndPercentage... skillAndPercentages) {
        this.id = id;
        this.name = name;
        this.skills = Arrays.asList(skillAndPercentages);
    }
}