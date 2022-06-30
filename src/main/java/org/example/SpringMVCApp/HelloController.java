package org.example.SpringMVCApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    String sayHello(){
        return "hello_world";
    }


}
