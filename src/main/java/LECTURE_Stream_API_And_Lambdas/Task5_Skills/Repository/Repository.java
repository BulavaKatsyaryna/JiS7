package LECTURE_Stream_API_And_Lambdas.Task5_Skills.Repository;

import LECTURE_Stream_API_And_Lambdas.Task5_Skills.Model.SkillAndPercentage;
import LECTURE_Stream_API_And_Lambdas.Task5_Skills.Model.User;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    List<User> userList = new ArrayList<>();

    User user1 = new User(1, "Kate", new SkillAndPercentage(20, "English"),
            new SkillAndPercentage(10, "Japan"),
            new SkillAndPercentage(30, "French"));

    User user2 = new User(2, "Nikolay", new SkillAndPercentage(60, "English"),
            new SkillAndPercentage(20, "Japan"),
            new SkillAndPercentage(50, "French"));

    User user3 = new User(3, "Varvara", new SkillAndPercentage(40, "English"),
            new SkillAndPercentage(70, "Japan"),
            new SkillAndPercentage(20, "French"));

    User user4 = new User(4, "Alisa", new SkillAndPercentage(50, "English"),
            new SkillAndPercentage(40, "Japan"),
            new SkillAndPercentage(60, "French"));

    public void addUsersToList() {
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

    }
}
