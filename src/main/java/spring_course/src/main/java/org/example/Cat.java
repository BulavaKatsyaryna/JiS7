package org.example;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Nya-Nya");
    }
}
