package com.code.controllers.learn.currentLectureController;

import com.code.models.lecture.Lecture;
import com.code.models.user.User;
import com.code.repo.lecture.LectureRepo;
import com.code.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class CurrentLectureController {
    @Autowired
    LectureRepo lectureRepo;
    @Autowired
    UserRepo userRepo;
    /*GET*/
    @GetMapping("/current_lecture")
    public String getCurrentLecture(Model model) {
        /*=============== User ======================*/
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object principal = auth.getPrincipal();
        User user = userRepo.findByUsername(auth.getName());
        /*========= Lecture =========*/
       Optional<Lecture> lecture = lectureRepo.findById(1l);

        ArrayList<Lecture> res = new ArrayList<>();
        lecture.ifPresent(res :: add);
        model.addAttribute("lec", res);

        return "/pages/current_lecture/current_lecture";
    }
}
