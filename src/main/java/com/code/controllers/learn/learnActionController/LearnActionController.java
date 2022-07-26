package com.code.controllers.learn.learnActionController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LearnActionController {
    @GetMapping("/learn_action")
    public String getLearnAction(Model model) {
        return "pages/system/pageDevelopment";
    }
}
