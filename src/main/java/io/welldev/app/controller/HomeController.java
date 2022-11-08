package io.welldev.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class HomeController {

    @GetMapping("/robbi")
    public String homeInit(Locale locale, Model model) {
        return "home";
    }
}
