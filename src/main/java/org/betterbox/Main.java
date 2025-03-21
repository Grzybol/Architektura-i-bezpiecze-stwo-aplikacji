package org.betterbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @RequestMapping("/")
    public String index() {
        return "Pierwsza aplikacja w Spring Boot";
    }
    @RequestMapping("/testowa-usluga")
    public String testowaUsluga() {
        return "To jest testowa usługa";
    }
}