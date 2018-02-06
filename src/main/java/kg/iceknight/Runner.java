package kg.iceknight;

import kg.iceknight.service.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring-config.xml");
        Printer printer = (Printer) context.getBean("defaultPrinter");
        printer.print();
    }
}
