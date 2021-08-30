package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = ctx.getBean("myPet", Dog.class);
        myDog.setName("Zhanna");

        Dog yourDog = ctx.getBean("myPet", Dog.class);
        yourDog.setName("Molly");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

//      Проверяем ссылаются myDog и yourDog на один и тот же объект:
//        System.out.println("Переменные ссылаются на один и тот же объект? " +
//                (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);

        ctx.close();
    }
}
