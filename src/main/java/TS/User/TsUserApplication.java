package TS.User;

import TS.User.entities.Role;
import TS.User.services.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class TsUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsUserApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RoleService roleService) {
		return args -> {
			roleService.save(new Role("ADMIN"));
			roleService.save(new Role("USER"));
		};

	}


}
