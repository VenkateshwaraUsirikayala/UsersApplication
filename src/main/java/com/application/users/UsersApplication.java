package com.application.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setId(1L);
//		user.setFirstName("Venkateshwara");
//		user.setLastName("Usirikayala");
//	}

}
