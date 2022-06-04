package com.zeroToHero;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitializerService {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {

		User firstUser = new User();
		firstUser.setUserRole(UserRole.ADMIN);
		firstUser.setName("Bob Marley Faruk");
		userRepository.save(firstUser);
	}

}
