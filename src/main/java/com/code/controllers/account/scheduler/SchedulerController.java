package com.code.controllers.account.scheduler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchedulerController {
    @GetMapping("/scheduler")
    public String getScheduler(Model model) {
        return "pages/system/pageDevelopment";
    }
}
