package lecture_SpringFramework;

import lecture_SpringFramework.bean.Developer;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Developer dev = (Developer) ctx.getBean("dev");
        BeanDefinitionReader beanDefinitionReader;

        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();

        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
