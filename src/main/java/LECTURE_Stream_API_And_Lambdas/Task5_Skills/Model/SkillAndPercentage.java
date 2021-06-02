package LECTURE_Stream_API_And_Lambdas.Task5_Skills.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SkillAndPercentage {

    private SkillEnum skill;
    private int skillPercentage;

}