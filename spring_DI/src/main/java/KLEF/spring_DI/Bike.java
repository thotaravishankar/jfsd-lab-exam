package KLEF.spring_DI;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("driving a bike");
	}

	

}
