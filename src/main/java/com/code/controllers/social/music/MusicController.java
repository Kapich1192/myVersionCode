package com.code.controllers.social.music;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {
    @GetMapping("/music")
    public String getMyMusic(Model model) {
        /*Meta*/
        model.addAttribute("title", "Music");
        return "pages/music/music";
    }
}
