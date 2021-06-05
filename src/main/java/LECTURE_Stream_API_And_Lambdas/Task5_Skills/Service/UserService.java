package LECTURE_Stream_API_And_Lambdas.Task5_Skills.Service;

import LECTURE_Stream_API_And_Lambdas.Task5_Skills.Model.User;

import java.util.Collection;
import java.util.List;

public interface UserService {

    User findUsersWithSpecificSkillPercentage(Collection<User> userList, String nameOfSkill);
}