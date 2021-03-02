package com.example.demo55656;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Demo55656Application {
      //  @Value("${DOCKER_ENV_VARIABLE:default_value}")
      // private String docker_env_variable;
      //  @GetMapping("/")
      //        public String home(){
      //            return docker_env_variable;
      //        }
        
	public static void main(String[] args) {
		SpringApplication.run(Demo55656Application.class, args);
	}

}
