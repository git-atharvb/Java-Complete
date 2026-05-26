package com.atharv.project.FirstSystem;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSystemApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(FirstSystemApplication.class, args);
	}
//	@Autowired
	//cannot use final along with Autowired
	private final PaymentService paymentService;
	//This is a "Constructor Dependency Injection", can use final along with private
	public FirstSystemApplication(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	@Override
	public void run(String... args) throws Exception{
		String payment = paymentService.pay();
		System.out.println("Payment Done : " + payment);
	}
}