package com.example.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	@RequestMapping("/greet")
	public String processGreetURI(Model model) {
		model.addAttribute("model", "Syed Fazal");
		return "greet";
	}
}

