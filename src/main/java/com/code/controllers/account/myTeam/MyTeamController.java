package com.code.controllers.account.myTeam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyTeamController {
    @GetMapping("/my_team")
    public String getMyTeam() {
        return "pages/system/pageDevelopment";
    }
}
