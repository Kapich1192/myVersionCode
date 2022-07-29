package com.code.controllers.learn.peerToPeerController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeerToPeerController {
    @GetMapping("/peer_to_peer")
    public String getPeerToPeer(Model model) {
        return "pages/peer_to_peer/peer_to_peer";
    }
}
