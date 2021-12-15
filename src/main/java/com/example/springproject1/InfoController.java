package com.example.springproject1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InfoController {

    String a;
    String b;

    @PostMapping("/info/{temp}/{humidity}")
    public String temp(@PathVariable String temp, @PathVariable String humidity) {
        a = temp;
        b = humidity;
        return "info/info";
    }

    @GetMapping("/index")
    public String indexPage(Model model) {
        model.addAttribute("temp", a);
        model.addAttribute("humidity", b);

        return "/info/info";
    }
}
