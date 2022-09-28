package tr.com.metea.customexception;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomExceptionApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		final var modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}
