package priv.dengjili.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import priv.dengjili.service.MyService;

@Controller
@RequestMapping("/springmvc")
public class PagerController {
	
	Logger logger = LoggerFactory.getLogger(PagerController.class);
	
	@Autowired
	private MyService service;
	
    @RequestMapping("/test")
    public String loginPage() {
    	System.out.println(service.toMessage());
    	logger.debug("adsfdasfadsf");
        return "test";
    }
    
    @RequestMapping("/test2")
    public String showMessage() {
        return "showMessage";
    }
}