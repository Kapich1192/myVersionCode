package com.code.controllers.login.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/log")
    public String getLogin(Model model) {
        return "pages/login/login";
    }
}
