package com.code.controllers.social.messanger;

import com.code.models.message.Message;
import com.code.models.user.User;
import com.code.repo.message.MessageRepo;
import com.code.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessangerController {
    @Autowired
    MessageRepo messageRepo;
    @Autowired
    UserRepo userRepo;
    @GetMapping("/messages")
    public String getMessages(Model model) {
        /*Meta*/
        model.addAttribute("title", "Sbergram Web");
        /*User*/
        /*===============User======================*/
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User userRecipient = userRepo.findByUsername(auth.getName());
        User userSender;
        /*Messages*/
        Iterable<Message> messages = messageRepo.findAllByRecipientId(userRecipient.getId());
        model.addAttribute("messages", messages);

//        Iterable<Message> recipientMessages = messageRepo.findByRecipientId(user.getId());
//        model.addAttribute("recipient",recipientMessages);
//
//        Iterable<Message> incomingMessage = messageRepo.findBySenderId(user.getId());
//        model.addAttribute("sender",incomingMessage);

        return "pages/messanger/messanger";
    }

}
