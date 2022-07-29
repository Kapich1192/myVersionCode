package com.code.controllers.interesting.hackathonsController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HackathonsController {
    @GetMapping("/hackathons")
    public String getHackathons(Model model) {
        return "pages/hackathons/hackathons";
    }
}
