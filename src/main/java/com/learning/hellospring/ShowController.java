package com.learning.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {
    @GetMapping("/shows")
    public String getShows(){
        return "shows";
    } 
}
