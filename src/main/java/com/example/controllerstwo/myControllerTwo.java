package com.example.controllerstwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class myControllerTwo {

    @GetMapping({"login"}) //
    public String showIndex(){
        return "index";
    }

}
