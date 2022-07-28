package com.code.controllers.social.video;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyVideoController {
    @GetMapping("/video")
    public String getMyVideo(Model model) {
        /*Meta*/
        model.addAttribute("title","Video");
        return "pages/video/video";
    }
}
