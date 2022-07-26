package com.code.controllers.interesting.posts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostsController {
    @GetMapping("/posts")
    public String getPosts(Model model) {
        return "pages/system/pageDevelopment";
    }
}
