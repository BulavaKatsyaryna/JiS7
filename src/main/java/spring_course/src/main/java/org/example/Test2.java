package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = ctx.getBean("myPet", Pet.class);
        pet.say();
        ctx.close();

    }
}
