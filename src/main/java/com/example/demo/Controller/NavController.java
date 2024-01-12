package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class NavController 

{
       public class NavControl 
       {
    	@GetMapping("/login")
    	public String login()
    	{
    		return "login";
    	}  	   
       }
       @GetMapping("/registration")
	public String registration()
	{
		return "registration";
	}
       
       @GetMapping("/newSong")
	public String newSong()
	{
    	   return "newSong";
	}
	
	
}
