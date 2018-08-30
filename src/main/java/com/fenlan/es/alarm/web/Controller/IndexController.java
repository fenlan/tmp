package com.fenlan.es.alarm.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("title", "wanmei");
        model.addAttribute("contain", "Hello World");
        return "index";
    }
}
