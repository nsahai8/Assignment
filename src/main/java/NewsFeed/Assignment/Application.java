package NewsFeed.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"NewsFeed.Assignment"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
