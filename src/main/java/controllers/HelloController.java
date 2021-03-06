package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "WORLD") String name, Model model) {
        model.addAttribute("name", name);

        return "hello";
    }
}
