package com.ciandt.dojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wcarvalho on 03/05/17.
 */
@Controller
public class IndexController {

    @RequestMapping("/home")
    public String home(Model model){
        return "view";
    }
}
