package org.westos.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.westos.ssm.service.UserService;
import org.westos.ssm.pojo.User;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public ModelAndView home(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        ModelAndView mav = new ModelAndView();
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        mav.setViewName("showUser");
        return mav;
    }
}