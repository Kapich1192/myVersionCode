package com.code.controllers.social.team;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
    @GetMapping("/team")
    public String getMyTeam(Model model) {
        /*Meta*/
        model.addAttribute("title","Team");
        return "pages/team/team";
    }
}
