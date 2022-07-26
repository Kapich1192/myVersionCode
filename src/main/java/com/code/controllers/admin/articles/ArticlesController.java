package com.code.controllers.admin.articles;

import com.code.models.article.Article;
import com.code.repo.article.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticlesController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/add_articles")
    public String getAddArticles(Model model) {
        Iterable<Article> articles = articleRepository.findAll();
        model.addAttribute("articles",articles);
        return "pages/admin/add_news";
    }
}
