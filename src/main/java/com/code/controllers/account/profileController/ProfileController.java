package com.code.controllers.account.profileController;

import com.code.models.user.User;
import com.code.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {
    @Autowired
    UserRepo userRepo;
    /*=========================================== GET ================================================================*/
    @GetMapping("/profile")
    public String getProfile(Model model) {
        /*=============== Meta ======================*/
        model.addAttribute("title","Profile");
        /*=============== User ======================*/
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object principal = auth.getPrincipal();
        User user = userRepo.findByUsername(auth.getName());
        model.addAttribute("usr",user);
        return "pages/profile/profile";
    }
    /*============================================ POST ==============================================================*/

    /*============================================ UPDATE ============================================================*/
    /*Update name*/
    @PostMapping("/profile/upd_name")
    public String updateUserName(@RequestParam String upd_name, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepo.findByUsername(auth.getName());
        user.setName(upd_name);
        userRepo.save(user);
        return "redirect:/profile";
    }
    /*Update lastname*/
    @PostMapping("/profile/upd_lastname")
    public String updateUserLastname(@RequestParam String upd_lastname,Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user =userRepo.findByUsername(auth.getName());
        user.setLastname(upd_lastname);
        userRepo.save(user);
        return "redirect:/profile";
    }

    /*Update username*/
//    @PostMapping("/profile/upd_username")
//    public String updateLogin(@RequestParam String upd_username, Model model) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        Object principal = auth.getPrincipal();
//        User user = userRepo.findByUsername(auth.getName());
//        user.setUsername(upd_username);
//        userRepo.save(user);
//        return "redirect:/profile";
//    }
    /*Update tel*/
    @PostMapping("/profile/upd_tel")
    public String updateUserTel(@RequestParam String upd_tel, Model model) {
        /*=============== User ======================*/
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object principal = auth.getPrincipal();
        User user = userRepo.findByUsername(auth.getName());
        user.setTel(upd_tel);
        userRepo.save(user);
        return "redirect:/profile";
    }
    /*Update email*/
    @PostMapping("/profile/upd_email")
    public String updateUserEmail(@RequestParam String upd_email, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object principal = auth.getPrincipal();
        User user = userRepo.findByUsername(auth.getName());
        user.setEmail(upd_email);
        userRepo.save(user);
        return "redirect:/profile";
    }
}
