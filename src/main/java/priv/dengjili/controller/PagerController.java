package priv.dengjili.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import priv.dengjili.service.MyService;

@Controller
@RequestMapping("/springmvc")
public class PagerController {
	
	@Autowired
	private MyService service;
	
    @RequestMapping("/test")
    public String loginPage() {
    	
    	System.out.println(service.toMessage());
        return "test";
    }
    
    @RequestMapping("/test2")
    public String showMessage() {
        return "showMessage";
    }
}