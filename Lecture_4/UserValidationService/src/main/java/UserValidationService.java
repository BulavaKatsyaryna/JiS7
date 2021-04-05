
public class UserValidationService {

    public void userValidation(User user){
        int firstNameLength = Integer.parseInt(user.getFirstName());
        int lastNameLength = Integer.parseInt(user.getLastName());
        int age = user.getAge();


        if(firstNameLength >= 3 && firstNameLength <= 15 & lastNameLength >= 3 && lastNameLength <= 15){
            System.out.println("Валидация успешна пройдена");
        }else throw new UserValidationExeptitions("Не верное количество введенных символов");
        if (age > 0 & age < 120){
            System.out.println("Валидация успешна пройдена");
        } else throw new UserValidationExeptitions("Недопустимый возраст");
    }


}


