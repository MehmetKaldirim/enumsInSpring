package com.zeroToHero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = "/user")
	public String createForm(Model model) {
		List<User> allUsers = userRepository.findAll();
		model.addAttribute("allUsers", allUsers);
		model.addAttribute("user", new User());
		model.addAttribute("UserRoles", UserRole.values());
		return "register";
	}

	@PostMapping(value = "/add")
	public String editUser(@ModelAttribute(value = "user") User user) {
		userRepository.save(user);
		return "redirect:/user";
	}
}
