package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = ctx.getBean("myPet", Pet.class);
        Person person = new Person(pet);
        person.callYourPet();

        ctx.close();
    }
}
