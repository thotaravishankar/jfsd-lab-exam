package KLEF.spring_DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Suziki implements Manufacturer {
	@Override
	public String name() {
		return "Suziki";
	}

}
