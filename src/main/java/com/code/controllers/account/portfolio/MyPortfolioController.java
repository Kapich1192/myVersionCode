package com.code.controllers.account.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPortfolioController {
    @GetMapping("/portfolio")
    public String getPortfolio(Model model) {
        return "pages/system/pageDevelopment";
    }
}
