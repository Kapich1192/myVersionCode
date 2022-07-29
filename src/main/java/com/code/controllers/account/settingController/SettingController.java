package com.code.controllers.account.settingController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {
    @GetMapping("/setting")
    public String getSetting(Model model) {
        return "pages/setting/setting";
    }
}
