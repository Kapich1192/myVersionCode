package com.code.controllers.social.mail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MailController {
    @GetMapping("/mail")
    public String getMail(Model model) {
        /*Meta*/
        model.addAttribute("title", "email");
        return "pages/email/email";
    }
}
