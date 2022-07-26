package com.code.controllers.learn.learnMapController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LearnMapController {
    @GetMapping("/learn_map")
    public String getLearnMap(Model model) {
        return "pages/system/pageDevelopment";
    }
}
