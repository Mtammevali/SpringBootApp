package com.mycompany;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("")
    public String showHomePage(){
        System.out.println("http://localhost:8080/");
        return "index";
    }
}
