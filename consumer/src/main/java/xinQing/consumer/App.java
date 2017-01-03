package xinQing.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xinQing.provider.service.ProviderService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] { "dubbo-consumer.xml" });
        context.start();
        ProviderService providerService = context.getBean(ProviderService.class);
        String say = providerService.say("dubbo!!");
        System.out.println(say);
    }
}
