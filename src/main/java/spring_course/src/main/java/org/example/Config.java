package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("myApp.properties")
//@ComponentScan("org.example")
public class Config {

        @Bean
        @Scope("singleton")
        public Pet catBean() {
            return new Cat();
        }

        @Bean
        public Person personBean() {
            return new Person(catBean());
        }
}
