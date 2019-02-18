package hello;

import hello.Greeter.Greeter;
import org.joda.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {

    //For initial commit
    @RequestMapping("/")
    String home() {
        Greeter greeter = new Greeter();
        return greeter.sayHello()+" The current local time is: " + new LocalTime();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}