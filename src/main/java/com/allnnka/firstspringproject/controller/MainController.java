package com.allnnka.firstspringproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {
    @GetMapping("/")
    public String index( Map<String, Object> model) {
        return "index";
    }
    @GetMapping("/hello")
    public String hello( Map<String, Object> model) {
        return "hello";
    }



}