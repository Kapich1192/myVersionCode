package com.code.controllers.social.tape;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TapeController {
    @GetMapping("/tape")
    public String getTape(Model model) {
        /*Meta*/
        model.addAttribute("title", "Tape");
        return "pages/tape/tape";
    }
}
