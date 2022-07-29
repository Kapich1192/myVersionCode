package com.code.controllers.progress.pointsController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PointsController {
    /*GET*/
    @GetMapping("/points")
    public String getPoints(Model model) {
        return "pages/points/points";
    }
}
