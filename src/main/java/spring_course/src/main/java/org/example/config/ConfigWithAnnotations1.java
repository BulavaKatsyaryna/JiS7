package org.example.config;

import org.example.Cat;
import org.example.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = ctx.getBean("personBean", Person.class);
        person.callYourPet();

//        Cat myCat = ctx.getBean("cat", Cat.class);
//        myCat.say();

        ctx.close();
    }
}
