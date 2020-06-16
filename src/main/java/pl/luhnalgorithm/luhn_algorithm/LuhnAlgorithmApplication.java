package pl.luhnalgorithm.luhn_algorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LuhnAlgorithmApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuhnAlgorithmApplication.class, args);
		System.out.println("Control digit: " + Luhn.findControlDigit());
		System.out.println("Valid number: " + Luhn.luhnAlgorithmCheck(Luhn.findControlDigit()));


	}

}
