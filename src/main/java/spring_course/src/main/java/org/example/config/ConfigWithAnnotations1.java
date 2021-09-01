package org.example.config;

import org.example.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = ctx.getBean("cat", Cat.class);
        myCat.say();

        ctx.close();
    }
}
