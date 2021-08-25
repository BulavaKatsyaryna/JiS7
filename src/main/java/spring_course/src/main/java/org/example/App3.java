package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        После создания бина Person, не пригодится
//        Pet pet = ctx.getBean("myPet", Pet.class);

        Person person = ctx.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        ctx.close();
    }
}
