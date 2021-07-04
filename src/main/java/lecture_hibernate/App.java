package lecture_hibernate;

import lecture_hibernate.service.UserServiceImpl;

public class App {

    public static void main(String[] args) {
        var userService = new UserServiceImpl();
//        var userEntity = userService.create("Polina", "Bekarevich", "Malyha@gmail.com");
//        System.out.println(userEntity);

        userService.findAll().forEach(System.out::println);
    }
}
