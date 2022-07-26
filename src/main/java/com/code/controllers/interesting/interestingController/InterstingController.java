package com.code.controllers.interesting.interestingController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterstingController {
    @GetMapping("/intersting")
    public String getInteresting(Model model) {
        return "pages/system/pageDevelopment";
    }
}
