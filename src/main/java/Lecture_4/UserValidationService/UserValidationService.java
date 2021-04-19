package Lecture_4.UserValidationService;

public class UserValidationService {

    public void userValidation(User user){
        int firstNameLength = user.getFirstName().length();
        int lastNameLength = user.getLastName().length();
        int age = user.getAge();


        if(firstNameLength >= 3 && firstNameLength <= 15 & lastNameLength >= 3 && lastNameLength <= 15){
            System.out.println("Валидация успешна пройдена");
        }else throw new UserValidationExeptitions("Не верное количество введенных символов");
        if (age > 0 & age < 120){
            System.out.println("Валидация успешна пройдена");
        } else throw new UserValidationExeptitions("Недопустимый возраст");
    }

//Предлагаю разделить эту валидацию на два метода. 1. validateFirstAndLastNameLength 2. validateAgePositive что то типо того, названия можешь сама придумать
}


