package com.code.controllers.dashboard.dashboardController;

import com.code.models.article.Article;
import com.code.models.user.User;
import com.code.repo.article.ArticleRepository;
import com.code.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DashboardController {
    @Autowired
    UserRepo userRepo;
    @Autowired
    ArticleRepository articleRepo;
/*GET*/
    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        /*Meta*/
        model.addAttribute("title", "Dashboard");
        model.addAttribute("Description", "Your working place");
        /*===============User======================*/
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object principal = auth.getPrincipal();
        User user = userRepo.findByUsername(auth.getName());
        model.addAttribute("users",user);
        /*Level*/
        model.addAttribute("user_level",user.getLevel());
        model.addAttribute("user_exp", user.getExperience());
        /*Info*/
        model.addAttribute("user_email", user.getEmail());
        model.addAttribute("user_tel", user.getTel());
        /*Points*/
        model.addAttribute("peer_points",user.getPeerPoints());
        /*=============== News ======================*/
        Iterable<Article> articles = articleRepo.findAll();
        model.addAttribute("articles",articles);
        return "pages/dashboard/dashboard";
    }
}
