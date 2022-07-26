package com.code.controllers.account.guild;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuildController {
    @GetMapping("/guild")
    public String getGuild(Model model) {
        return "pages/system/pageDevelopment";
    }
}
