package com.code.controllers.interesting.newsController;

import com.code.models.article.Article;
import com.code.repo.article.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class NewsController {
    @Autowired
    private ArticleRepository articleRepository;
    /*GET*/
    @GetMapping("/news")
    public String getNews(Model model) {
        /*Meta description page*/
        model.addAttribute("title","News");
        /*Articles*/
        Iterable<Article> articles = articleRepository.findAll();
        model.addAttribute("articles",articles);
        return "pages/news/news";
    }
    @GetMapping("/news/add")
    public String getAddArticle(Model model) {
        /*Meta*/
        model.addAttribute("title","Add article");

        return "pages/news/addArticle";
    }
    @GetMapping("/news/{id}")
    public String getSingleNew(@PathVariable(value = "id") Long id, Model model) {
        Optional<Article> article = articleRepository.findById(id);
        ArrayList<Article> res = new ArrayList<>();
        article.ifPresent(res::add);
        model.addAttribute("article",res);
        return "pages/news/article";
    }
    /*POST*/
    @PostMapping("/news/add")
    public String postAddArticle(@RequestParam String title,
                                 @RequestParam String anons,
                                 @RequestParam String description,
                                 @RequestParam String full_text,
                                 Model model) {
        Article articleRequest = new Article();
        articleRequest.setTitle(title);
        articleRequest.setAnons(anons);
        articleRequest.setDescription(description);
        articleRequest.setFull_text(full_text);
        articleRepository.save(articleRequest);

        return "redirect:/news";
    }

}
