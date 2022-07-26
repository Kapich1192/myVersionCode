package com.code.controllers.progress.tribeTournament;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TribeTournamentController {
    @GetMapping("/tribe_tournament")
    public String getTribeTournament(Model model) {
        return "pages/system/pageDevelopment";
    }
}
