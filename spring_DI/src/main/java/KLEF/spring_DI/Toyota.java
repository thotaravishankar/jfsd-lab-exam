package KLEF.spring_DI;
import org.springframework.stereotype.Component;
@Component
public class Toyota implements Manufacturer {
	@Override
	public String name() {
		return "Toyota";
	}
	

}
