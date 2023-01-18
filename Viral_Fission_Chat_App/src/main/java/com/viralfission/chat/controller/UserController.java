package com.viralfission.chat.controller;

import com.viralfission.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String listContacts(Model model){
        model.addAttribute("contacts", userService.getAllContacts());
        return "user/home";
    }

    @GetMapping("/chat/{id}")
    public String chat(){
        return "user/chat";
    }
}
