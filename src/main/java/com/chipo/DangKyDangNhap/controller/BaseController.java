package com.chipo.DangKyDangNhap.controller;

import com.chipo.DangKyDangNhap.utils.WebUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class BaseController {

    @RequestMapping(value = "/loginSuccess", method = RequestMethod.POST)
    public String login(User user, Principal principal, Model model) {

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "memberPage";
    }
}
