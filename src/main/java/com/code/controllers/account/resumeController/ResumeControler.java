package com.code.controllers.account.resumeController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeControler {
    /*GET*/
    @GetMapping("/resume")
    public String getResume(Model model) {
        return "pages/resume/resume";
    }
}
