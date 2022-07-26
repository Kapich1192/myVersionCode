package com.code.controllers.progress.projectsProgress;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectsProgressController {
    @GetMapping("/projects_progress")
    public String getProjectsProgress(Model model) {
        return "pages/system/pageDevelopment";
    }
}
