package com.code.models.user;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "usr")
public class User {
    /*=============== FIELDS ===============*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*Profile*/
    private String username;
    private String password;
    private boolean active;
    private String email;
    private String tel;
    /*level*/
    private int level = 0;
    private int experience = 0;
    /*points*/
    private int peerPoints = 0;
    /*Role*/
    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER )
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    /*skills*/
    private int htmlSkill = 0;
    private int javaScriptSkill= 0;
    private int javaSkill = 0;
    /*=============== CONSTRUCTORS ===============*/
    public User() {}

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*=============== GETTERS ===============*/
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public String getTel() { return tel; }
    public boolean isActive() { return active; }
    public Set<Role> getRoles() { return roles; }
    public int getPeerPoints() { return peerPoints; }
    public int getLevel() { return level;}
    public int getExperience() { return experience; }
    public int getHtmlSkill() { return htmlSkill; }
    public int getJavaScriptSkill() { return javaScriptSkill; }
    public int getJavaSkill() { return javaSkill; }
    /*=============== SETTERS ===============*/
    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }
    public void setTel(String tel) { this.tel = tel; }
    public void setActive(boolean active) { this.active = active; }
    public void setRoles(Set<Role> roles) { this.roles = roles; }
    public void setPeerPoints(int peerPoints) { this.peerPoints = peerPoints; }
    public void setLevel(int level) { this.level = level; }
    public void setExperience(int experience) { this.experience = experience; }
    public void setHtmlSkill(int htmlSkill) { this.htmlSkill = htmlSkill; }
    public void setJavaScriptSkill(int javaScriptSkill) { this.javaScriptSkill = javaScriptSkill; }
    public void setJavaSkill(int javaSkill) { this.javaSkill =javaSkill; }
}
