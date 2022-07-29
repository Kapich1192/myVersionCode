package com.code.controllers.account.vacancyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VacancyController {
    /*GET*/
    @GetMapping("/vacancy")
    public String getVacancy(Model model) {
        return "pages/vacancy/vacancy";
    }
}
