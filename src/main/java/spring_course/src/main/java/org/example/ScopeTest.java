package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = ctx.getBean("dog", Dog.class);
        myDog.say();
//        Dog yourDog = ctx.getBean("dog", Dog.class);
//
//        System.out.println("Переменные ссылаются на один и тот же объект?" + (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);

        ctx.close();
    }
}
