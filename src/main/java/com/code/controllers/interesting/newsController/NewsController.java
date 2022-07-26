package com.code.controllers.interesting.newsController;

import com.code.models.article.Article;
import com.code.repo.article.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {
    @Autowired
    private ArticleRepository articleRepository;
    /*GET*/
    @GetMapping("/news")
    public String getNews(Model model) {
        Iterable<Article> articles = articleRepository.findAll();
        model.addAttribute("articles",articles);
        return "pages/news/news";
    }
    @GetMapping("/news/")
    public String getArticle(Model model) {
        return "news/article";
    }

    /*POST*/
}
