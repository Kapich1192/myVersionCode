package com.code.controllers.account.careerController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CareerController {
    /*GET*/
    @GetMapping("/career")
    public String getCareer(Model model) {
        return "pages/career/career";
    }
}
