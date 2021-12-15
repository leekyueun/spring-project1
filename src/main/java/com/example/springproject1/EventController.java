package com.example.springproject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventController {
    @GetMapping("/info/{temp}/{humidity}")
    public String temp(@PathVariable String temp, @PathVariable String humidity) {
        return "/info/info";
    }
}
