package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = ctx.getBean("personBean", Person.class);
        person.callYourPet();

//        Pet cat1 = ctx.getBean("catBean", Pet.class);
//        Pet cat2 = ctx.getBean("catBean", Pet.class);
//        cat.say();

        ctx.close();
    }
}
