package me.trihung.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminHomeController {
	
	@GetMapping("/")
	public String index() {
		return "/admin/home";
	}
	
}
