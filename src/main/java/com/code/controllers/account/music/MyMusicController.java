package com.code.controllers.account.music;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyMusicController {
    @GetMapping("/my_music")
    public String getMyMusic(Model model) {
        return "pages/system/pageDevelopment";
    }
}
