package com.example.backend;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class homecontroller {

	
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
	
		System.out.println("this is testing");
		return "testing";
	}
	
	
	
}
