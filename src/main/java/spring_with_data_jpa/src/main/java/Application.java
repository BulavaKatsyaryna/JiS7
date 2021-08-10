import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("java");
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
