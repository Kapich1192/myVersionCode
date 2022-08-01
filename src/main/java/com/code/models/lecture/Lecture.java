/*
* java(1-100)
* C(101-200)
* C++(201-300)
* Python(301-400)
* */
package com.code.models.lecture;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;
@Entity
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String teg;
    private String bodyLecture;
    private String videoLink;
    /*CONSTRUCTORS*/
    public Lecture() {}
    /* GETTERS */
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getTeg() { return teg; }
    public String getBodyLecture() { return bodyLecture; }
    public String getVideoLink() { return videoLink; }
    /*SETTERS*/
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setTeg(String teg) { this.teg = teg; }
    public void setBodyLecture(String bodyLecture) { this.bodyLecture = bodyLecture; }
    public void setVideoLink(String videoLink) { this.videoLink = videoLink; }
}
