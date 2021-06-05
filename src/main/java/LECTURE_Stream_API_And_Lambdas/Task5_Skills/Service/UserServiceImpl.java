package LECTURE_Stream_API_And_Lambdas.Task5_Skills.Service;

import LECTURE_Stream_API_And_Lambdas.Task5_Skills.Model.User;
import LECTURE_Stream_API_And_Lambdas.Task5_Skills.Repository.Repository;

import java.util.Collection;

public class UserServiceImpl implements UserService {

    static {
        Repository repository = new Repository();
        repository.addUsersToList();
    }

    @Override
    public User findUsersWithSpecificSkillPercentage(Collection<User> userList, String nameOfSkill) {
        return null;
    }
}
