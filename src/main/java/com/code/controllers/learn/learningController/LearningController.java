package com.code.controllers.learn.learningController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LearningController {
    @GetMapping("/learning")
    public String getLearning(Model model) {
        return "pages/system/pageDevelopment";
    }
}
