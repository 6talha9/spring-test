package lu.lllc.boottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String hello(){
		System.out.println("adsadsadsadasdsa>>>>>>>>>>");
		return "hello";
	}
}
