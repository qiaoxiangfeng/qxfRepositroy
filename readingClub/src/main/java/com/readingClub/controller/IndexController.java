package com.readingClub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.readingClub.util.Msg;

//@Controller
public class IndexController {

	@RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }
	
	@RequestMapping("/index")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }

}
