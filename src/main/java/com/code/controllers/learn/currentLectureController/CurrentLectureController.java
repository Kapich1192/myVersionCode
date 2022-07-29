package com.code.controllers.learn.currentLectureController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrentLectureController {
    /*GET*/
    @GetMapping("/current_lecture")
    public String getCurrentLecture(Model model) {
        return "/pages/current_lecture/current_lecture";
    }
}
