package web.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auth zme on 2019/1/2 17:38
 **/
@Controller
@RequestMapping("/home")
public class DemoController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
