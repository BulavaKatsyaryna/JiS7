package lecture_SpringFramework.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {
    private String name;
    private String skill;
    private int lvl;
    private boolean isIntensive;
}
