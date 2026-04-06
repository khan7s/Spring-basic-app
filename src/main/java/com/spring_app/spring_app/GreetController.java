
package com.spring_app.spring_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class GreetController {

    @GetMapping("/app")
    public String greet(){
        return "Hello Spring!..";
    }
     
}