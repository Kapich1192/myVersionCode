package com.code.controllers.dashboard.dashboardController;

import com.code.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @Autowired
    UserRepo userRepo;
/*GET*/
    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        model.addAttribute("title", "Dashboard");
        model.addAttribute("Description", "Your working place");
        return "pages/dashboard/dashboard";
    }
}
