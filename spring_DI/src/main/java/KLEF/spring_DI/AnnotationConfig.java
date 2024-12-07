package KLEF.spring_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AnnotationConfig {
	@Bean
	public Manufacturer getManufacturer() {
		return new Toyota();
	}

}
