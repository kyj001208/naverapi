package greenGroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class GreenGroupApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenGroupApplication.class, args);
	}
	
	@Bean
	ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
