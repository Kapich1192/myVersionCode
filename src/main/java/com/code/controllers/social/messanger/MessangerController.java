package com.code.controllers.social.messanger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessangerController {
    @GetMapping("/messages")
    public String getMessages(Model model) {
        /*Meta*/
        model.addAttribute("title", "Sbergram Web");
        return "pages/messenger/messenger";
    }

}
