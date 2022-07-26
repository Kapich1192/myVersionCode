package com.code.controllers.account.messanger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessangerController {
    @GetMapping("/messages")
    public String getMessages(Model model) {
        return "pages/system/pageDevelopment";
    }

}
