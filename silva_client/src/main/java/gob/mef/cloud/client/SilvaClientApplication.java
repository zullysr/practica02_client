package gob.mef.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SilvaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SilvaClientApplication.class, args);
	}
	
	@Configuration
	class Config{
		@Bean
		public RestTemplate restTemplate() {
			return new RestTemplate();
		}
	}
}
