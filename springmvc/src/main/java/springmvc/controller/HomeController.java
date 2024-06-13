package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
@RequestMapping("/")	
public String home(Model model) {
	System.out.println("this is home url");
	model.addAttribute("name","Ayush bhargav");
	model.addAttribute("id",510);
	List<String> friend=new ArrayList<String>();
	friend.add("friend1");
	friend.add("friend2");
	friend.add("friend3");
	model.addAttribute("a",friend);
	return "index";
}
@RequestMapping("/about")	
public String about() {
	System.out.println("this is about url");
	return "about";
}


@RequestMapping("/help")
public 	ModelAndView help() {
	ModelAndView modelandview=new ModelAndView();
	modelandview.addObject("name","Springmvc");
	modelandview.addObject("id",101);
	List<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	modelandview.addObject("marks",list);
	modelandview.setViewName("help");
	return modelandview;
	
}
}