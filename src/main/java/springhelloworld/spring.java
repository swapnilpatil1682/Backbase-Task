package springhelloworld;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration

public class spring {

    @RequestMapping("/")
    String home() {
        return "Hello Swapnil !!  Welcome to Backbase Assignment !!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(spring.class, args);
    }




}
