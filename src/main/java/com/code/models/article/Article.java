package com.code.models.article;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String anons;
    private String full_text;
    private String author = "21school";
    /*constructors*/
    public Article() {}
    public Article(String title) {
        this.title = title;
    }
    /*getters*/
    public Long getId() {return id;}
    public String getTitle() {return title;}
    public String getDescription() {return description;}
    public String getFull_text() {return full_text;}
    public String getAnons() {return anons;}
    public String getAuthor() { return author; }

    /*setters*/
    public void setId(Long id) {this.id = id;}
    public void setTitle(String title) {this.title = title;}
    public void setDescription(String description) {this.description = description;}
    public void setFull_text(String full_text) {this.full_text = full_text;}
    public void setAnons(String anons) {this.anons = anons;}
    public void setAuthor(String author) {this.author = author;}
}
