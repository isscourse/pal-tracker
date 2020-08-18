package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    String welcomeMsg = "";


    public WelcomeController(@Value("${welcome.message}") String message){
        welcomeMsg = message;
    }

    @GetMapping("/")
    public String sayHello() {
        System.out.println(welcomeMsg);
        return welcomeMsg;
    }
}