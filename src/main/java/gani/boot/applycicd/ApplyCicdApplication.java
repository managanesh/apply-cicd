package gani.boot.applycicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApplyCicdApplication {

    @GetMapping("/")
    public String hello(){
        return "Hello Ganesh";
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplyCicdApplication.class, args);
    }

}
