package com.code.controllers.account.video;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyVideoController {
    @GetMapping("/my_video")
    public String getMyVideo(Model model) {
        return "pages/system/pageDevelopment";
    }
}
