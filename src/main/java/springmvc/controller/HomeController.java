package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller    //4th step- creating controller   //5th step is to create a view page (will find in WEB-INF/views/index.jsp)
public class HomeController {

    //returning view/page name
    //this will work when you fire /home
    //@GetMapping("/hello")
    @RequestMapping("/home")
    public String home(Model model){       //--handler mapping with the url
        System.out.println("This is home url");
        model.addAttribute("name","Maneesha Chandel");
        model.addAttribute("id",1421);
        List<String> friends=new ArrayList<String>();
        friends.add("Nikita");
        friends.add("Vaishali");
        friends.add("Sheetal");
        friends.add("Devanshi");
        friends.add("Alka");
        friends.add("Bebo");
        model.addAttribute("f",friends);
        return "index";  //          /WEB-INF/views/index.jsp
    }
    //@GetMapping("/about")
    @RequestMapping("/about")
    public String about(){
        System.out.println("The is about controller");
        return "about";
    }
    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("This is help controller");
        //creating ModelAndView object
        ModelAndView modelAndView=new ModelAndView();
        //setting the data
        modelAndView.addObject("name","Uttam");
        modelAndView.addObject("id",2.0);
        LocalDateTime localDateTime=LocalDateTime.now();
        modelAndView.addObject("time",localDateTime);
        List<Integer> list=new ArrayList<Integer>();
        list.add(44);
        list.add(90);
        list.add(39);
        list.add(12);
        modelAndView.addObject("marks",list);
        //setting the view name
        modelAndView.setViewName("help");
        return modelAndView;
    }

}
