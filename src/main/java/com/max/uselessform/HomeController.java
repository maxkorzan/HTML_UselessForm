package com.max.uselessform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

   @RequestMapping("/bootstrap")
    public String bootstrap(){
        return "bootstraplesson";
    }


}
