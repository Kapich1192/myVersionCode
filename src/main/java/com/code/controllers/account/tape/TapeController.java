package com.code.controllers.account.tape;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TapeController {
    @GetMapping("/tape")
    public String getTape(Model model) {
        return "pages/system/pageDevelopment";
    }
}
