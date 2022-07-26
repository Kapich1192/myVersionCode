package com.code.controllers.account.myChapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyChapterController {
    @GetMapping("/my_chapter")
    public String getMyChapter(Model model) {
        return "pages/system/pageDevelopment";
    }
}
