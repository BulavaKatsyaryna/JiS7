import creditCard.service.CreditCardService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext("java");
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        var creditCardServiceImpl = (CreditCardService) ctx.getBean("creditCardServiceImpl");
        var addressServiceImpl = ctx.getBean("addressServiceImpl");
        var belinvestCard = creditCardServiceImpl.create("BelinvestBank", "8364 1863 7364 8263", new BigDecimal(2100.00));
    }
}
