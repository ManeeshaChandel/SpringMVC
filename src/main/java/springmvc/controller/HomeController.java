package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    //4th step- creating controller   //5th step is to create a view page (will find in WEB-INF/views/index.jsp)
@RequestMapping("/home")
public class HomeController {

    //returning view/page name
    //this will work when you fire /home
    @GetMapping("/hello")
    public String home(){
        System.out.println("This is home url");
        return "index";  //          /WEB-INF/views/index.jsp
    }

}
