import address.service.AddressService;
import basket.service.BasketService;
import creditCard.service.CreditCardService;
import customer.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext("java");
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        var creditCardServiceImpl = (CreditCardService) ctx.getBean("creditCardServiceImpl");
        var addressServiceImpl = (AddressService) ctx.getBean("addressServiceImpl");
        var basketServiceImpl = (BasketService) ctx.getBean("basketServiceImpl");
        var customerServiceImpl = (CustomerService) ctx.getBean("customerServiceImpl");

        var belinvestCard = creditCardServiceImpl
                .create("BelinvestBank", "8364 1863 7364 8263", new BigDecimal(2100.00));

        var priorCard = creditCardServiceImpl
                .create("PriorBank", "2724 9744 2874 3643", new BigDecimal(1000.00));

        var address = addressServiceImpl.create("Minsk", "Belarus", "130", "Bratiev Rait");

        var basket = basketServiceImpl.create();

        customerServiceImpl.create("Katya", "Bulova", "bulava", "BulovaKatsyalina@gmail.com",
                "12345", 1L, 1L, List.of(1L,2L));

        boolean isExist = customerServiceImpl.existCustomer(1L, "bulava", 1L);
        System.out.println(isExist);
    }
}
