package com.korit.karaoke.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ModificationController {

    @GetMapping({"/mypage"})
    public String mypage() {
        return "admin/admin_modification";
    }

    @PutMapping({"/mypage/edit_information"})
    public String editInformation() {
        return "admin/admin_edit_information";
    }

    @GetMapping({"/mypage/pwd_change"})
    public String pwdChange() {
        return "admin/admin_pwd_change";
    }

}
