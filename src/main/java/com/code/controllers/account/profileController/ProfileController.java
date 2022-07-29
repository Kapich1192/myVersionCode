package com.code.controllers.account.profileController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    @GetMapping("/profile")
    public String getProfile(Model model) {
        return "pages/profile/profile";
    }
}
