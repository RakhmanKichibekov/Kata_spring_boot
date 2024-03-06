package com.kichibekov.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Добро пожаловать!");
        messages.add("Кликните по ссылке ниже, чтобы посмотреть пользователей");
        model.addAttribute("messages", messages);
        return "index";
    }
}