package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
    @Autowired   //will need @Service or @Component annotation over the class for getting object
    private UserService userService;
    @ModelAttribute
    public void commonDataForModel(Model m){
        m.addAttribute("Header","Learn Code With Durgesh");
        m.addAttribute("Desc","hOME fOr PrOgrammer");
    }
    @RequestMapping("/contact")
    public String showForm(){
        return "contact";
    }
    @RequestMapping(path="/processform",method= RequestMethod.POST)
    public String handleForm(@ModelAttribute User user,Model model){
        System.out.println(user);
        int createdUser=this.userService.createUser(user);
        model.addAttribute("msg","User created with id"+createdUser);
        return "success";
        //@ModelAttribute annotation is doing 3 steps
        //fetching data from client/view
        //storing in "User" class' attributes
        //fetching data from User and sending it to another view page i.e.- success
        //you can see below code for the working of @ModelAttribute instead of @RequestParam
        //Note- User class Attributes' name should be same as contact.jsp's name parameter inside input tag
    }


    /*
    @RequestMapping(path="/processform",method= RequestMethod.POST)
    public String handleForm(@RequestParam(name="email", required=false) String userEmail,
                             @RequestParam("userName") String userName,
                             @RequestParam("password") String userPassword,
                             Model model){
        //fetching data from client/view using RequestParam annotation
        //passing the parameter in RequestParam from name of "input" tag in .jsp file
        User user=new User();
        user.setUserName(userName);
        user.setPassword(userPassword);
        user.setEmail(userEmail);
        System.out.println(user);
        //from the above line we are fetching data from view i.e. contact and saving it in User's object
//        model.addAttribute("name",userName);
//        model.addAttribute("email",userEmail);
//        model.addAttribute("password",userPassword);
        model.addAttribute("user",user);
        return "success";
        //from the above line we are fetching data from User's object and sending it to another view page i.e.- success
        //coz we need new page after clicking on submit button
    }*/
}
