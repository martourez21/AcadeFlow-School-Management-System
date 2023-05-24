package com.example.acadeflowschoolmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/acadeflow/v1")
public class HomeController {

    @GetMapping("/index")
    public String get_layout_page(){
        return "_layout";
    }

    @GetMapping("/dashboard")
    public String get_admin_dashboard(){
        return "dashboard-admin";
    }

    @GetMapping("/students")
    public String get_all_students(){
        return "students";
    }


}
