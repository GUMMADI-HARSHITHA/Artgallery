package com.jfsd.artgallery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class art {
	
	@RequestMapping("/")
	
	public String index() {
		
		return  "index";
	}

}
