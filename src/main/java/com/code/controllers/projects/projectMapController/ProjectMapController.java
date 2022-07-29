package com.code.controllers.projects.projectMapController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectMapController {
    @GetMapping("/project_map")
    public String getProjectMap(Model model) {
        return "pages/project_map/project_map";
    }
}
