package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class Contactcontroller {
	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("Header","Hi");
		m.addAttribute("Desc","By");
	}
	@RequestMapping("/contact")
public String showForm() {
	return "contact";
} 
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		return "success";
	}	
	
	
}
/*@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleForm(@RequestParam("email") String userEmail,@RequestParam("username") String name,@RequestParam("id") Integer rid,@RequestParam("password") String userpassword,Model model) {
  //  System.out.println(userEmail);
  //  System.out.println(name);
   // System.out.println(rid);
    //System.out.println(userpassword);
    User user=new User();
    user.setEmail(userEmail);
    user.setUsername(name);
    user.setId(rid);
    user.setPassword(userpassword);
    System.out.println(user);
   // model.addAttribute("username",name);
    //model.addAttribute("useremail", userEmail);
    //model.addAttribute("userid", rid);
	model.addAttribute("user",user);
    return "success";
}*/