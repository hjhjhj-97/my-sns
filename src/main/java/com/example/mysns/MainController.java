package com.example.mysns;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    public mainpage (){
        return "feed.html";
    }
}
