package com.code.controllers.projects.examController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamController {
    @GetMapping("/exam")
    public String getExam(Model model) {
        return "pages/system/pageDevelopment";
    }
}
