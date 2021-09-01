package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = ctx.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = ctx.getBean("myPet", Dog.class);
        yourDog.say();

        ctx.close();
    }
}
