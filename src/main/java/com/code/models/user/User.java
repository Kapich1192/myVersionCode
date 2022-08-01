package com.code.models.user;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "usr")
public class User {
    /*============================================ FIELDS ============================================================*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*Profile*/
    private String name;
    private String lastname;
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
    private int cssSkill = 0;
    private int javaScriptSkill= 0;
    private int cppSkill = 0;
    private int pythonSkill = 0;
    private int javaSkill = 0;
    private int csharpSkill = 0;
    private int kotlinSkill = 0;
    private int swiftSkill = 0;
    private int cSkill = 0;
    private int algorithmsSkill = 0;
    private int sqlSkill = 0;
    private int phpSkill = 0;
    /*learning and projects*/
    private Long currentLectureId = 0l;

    /*============================== CONSTRUCTORS ====================================================================*/
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

    /*============================================== GETTERS =========================================================*/
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
    public int getCssSkill() { return cssSkill; }
    public int getCppSkill() { return cppSkill; }
    public int getPythonSkill() { return pythonSkill; }
    public int getCsharpSkill() { return csharpSkill; }
    public int getKotlinSkill() { return kotlinSkill; }
    public int getSwiftSkill() { return swiftSkill; }
    public int getcSkill() { return cSkill; }
    public int getAlgorithmsSkill() { return algorithmsSkill; }
    public int getSqlSkill() { return sqlSkill; }
    public int getPhpSkill() { return phpSkill; }
    public String getName() { return name; }
    public String getLastname() { return lastname; }
    /*============================================== SETTERS =========================================================*/
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
    public void setCssSkill(int cssSkill) { this.cssSkill = cssSkill; }
    public void setCppSkill(int cppSkill) { this.cppSkill = cppSkill; }
    public void setPythonSkill(int pythonSkill) { this.pythonSkill = pythonSkill; }
    public void setCsharpSkill(int csharpSkill) { this.csharpSkill = csharpSkill; }
    public void setKotlinSkill(int kotlinSkill) { this.kotlinSkill = kotlinSkill; }
    public void setSwiftSkill(int swiftSkill) { this.swiftSkill = swiftSkill; }
    public void setcSkill(int cSkill) { this.cSkill = cSkill; }
    public void setAlgorithmsSkill(int algorithmsSkill) { this.algorithmsSkill = algorithmsSkill; }
    public void setSqlSkill(int sqlSkill) { this.sqlSkill = sqlSkill; }
    public void setPhpSkill(int phpSkill) { this.phpSkill = phpSkill; }
    public void setName(String name) { this.name = name; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setCurrentLectureId(Long currentLectureId) { this.currentLectureId = currentLectureId; }
    /*================================================= SYSTEM =======================================================*/
    /*================================================= SYSTEM =======================================================*/
    /*toString*/
    /*hashCode*/
    /*equals*/
    /*initialize*/
    /*================================================= STATIC METHODS ===============================================*/
    /*================================================= METHODS CLASS ================================================*/
    /*peer points down*/
    public void peerPointsDown() {
        peerPoints--;
    }
    /*peer points upp*/
    public void peerPointsUpp() {
        peerPoints++;
    }
    /*check experience*/
    public void checkExp() {
        if (level % 2 == 1) {
            if (experience > 500) {
                levelUp();
            }
        } else {
            if (experience > 1000) {
                levelUp();
            }
        }
    }
    /*level up*/
    public void levelUp() {
        level++;
        experience = 0;
    }
}
