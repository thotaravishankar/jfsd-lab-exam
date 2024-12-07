package KLEF.spring_DI;

import org.springframework.stereotype.Component;

@Component
public class Tyres {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Tyre";
	}

}
