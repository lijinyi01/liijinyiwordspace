package com.web.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.awt.image.ImageProducer;
import java.util.Map;

@Controller
public class LoginController {

     //@PostMapping(value="/user/index")
   @RequestMapping(value="/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session
                        ){

         if(!StringUtils.isEmpty(username)  && "123456".equals(password)){
             session.setAttribute("loginUser",username);
             return "redirect:/main.html";
            }else {
             map.put("massage","qingchongxinshuru");
             return "index";
         }

    }
}
