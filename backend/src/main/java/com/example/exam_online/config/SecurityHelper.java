package com.example.exam_online.config;

import com.example.exam_online.entity.User;
import com.example.exam_online.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Component
public class SecurityHelper {
	private static UserRepository userRepository;
	@Autowired
	private UserRepository autowiredComponent;
	
	@PostConstruct
	private void init() {
		userRepository = this.autowiredComponent;
	}
	public static User currentUser (){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user;
		//that mean user anonymous
		if(authentication instanceof AnonymousAuthenticationToken) {
			user  = new User();
			user.setUsername("anonymous");
			if(userRepository.findByUsername("anonymous") == null) {
				userRepository.save(user);
			}
		} else {
			user = (User) authentication.getPrincipal();
		}
		return user;
	}
}
