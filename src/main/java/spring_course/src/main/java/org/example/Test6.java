package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = ctx.getBean("personBean", Person.class);
        person.callYourPet();

        ctx.close();
    }
}
