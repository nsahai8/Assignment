package NewsFeed.Assignment;

import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import NewsFeed.Assignment.services.Newspaper;
import NewsFeed.Assignment.servicesimpl.NewspaperFactory;

@SpringBootApplication(scanBasePackages={"NewsFeed.Assignment"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
 
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
