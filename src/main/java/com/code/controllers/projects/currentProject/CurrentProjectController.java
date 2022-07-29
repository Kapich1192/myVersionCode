package com.code.controllers.projects.currentProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrentProjectController {
    @GetMapping("/current_project")
    public String getCurrentProject(Model model) {
        return "pages/current_project/current_project";
    }
}
