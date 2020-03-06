package com.example.stocks.controllers;
import com.example.stocks.services.LoginService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.swing.*;


import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value="/stockuser/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("login")
    public JSONObject verifyLogin(@RequestParam("email") String email,
                                  @RequestParam("password") String password,
                                  HttpSession session,
                                  ModelMap modelMap) throws ParseException {

        String pass= loginService.validateUser(email);
        String res = "{ \"response\":";
        String t =  "\"true\"}";
        String f =  "\"false\"}";

        JSONParser mypar = new JSONParser();
        JSONObject logintrue = (JSONObject) mypar.parse(res + t);
        JSONObject loginfail = (JSONObject) mypar.parse(res + f);

        System.out.println(res + t);

        if(password.equals(pass)) return logintrue;
        else if(pass == null) return loginfail;
        else return loginfail;

    }
//    @PostMapping("login")
//    public boolean verifyLogin( @RequestParam("email") String email,
//                                @RequestParam("password") String password,
//                              HttpSession session,
//                              ModelMap modelMap) {
//
//        String auth = loginService.getUser(email,password);
//        if(auth.equals(""))
//        {
//            modelMap.put("error", "Invalid Account");
//            return false;
//
//        }
//        else
//        {
//            session.setAttribute("email", email);
//            return true;
//        }
//    }

        @GetMapping("logout")
        public String logout (HttpSession session)
        {
            session.invalidate();
            return "redirect:../userlogin";
        }

    }


