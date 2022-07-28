package com.code.controllers.social.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
    @GetMapping("/portfolio")
    public String getPortfolio(Model model) {
        /*Meta*/
        model.addAttribute("title", "Portfolio");
        return "pages/portfolio/portfolio";
    }
}
