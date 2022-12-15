package org.hdcd.controller.result;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home(Locale locale, Model model) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyymmdd");
		String fordate = now.format(formatter);
		model.addAttribute("servertime",fordate);
	return "home";
	}

}
