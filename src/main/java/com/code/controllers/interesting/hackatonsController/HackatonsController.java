package com.code.controllers.interesting.hackatonsController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HackatonsController {
    @GetMapping("/hack")
    public String getHackatons(Model model) {
        return "pages/system/pageDevelopment";
    }
}
