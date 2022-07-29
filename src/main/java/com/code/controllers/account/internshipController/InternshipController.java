package com.code.controllers.account.internshipController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InternshipController {
    /*GET*/
    @GetMapping("/internship")
    public String getInternship(Model model) {
        return "pages/internship/internship";
    }
}
