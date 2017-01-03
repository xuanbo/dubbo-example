package xinQing.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.println(" app run ");
        System.in.read(); // 按任意键退出
    }
}
