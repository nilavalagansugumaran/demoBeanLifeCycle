package com.example.demoBeanLifeCycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoBeanLifeCycleApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DemoBeanLifeCycleApplication.class, args);
		MyComponent c1 = ctx.getBean(MyComponent.class);
		MyComponent c2 = ctx.getBean(MyComponent.class);
		System.out.println("C1 ==> " + c1.toString() + " ==> " + c1.hashCode());
		System.out.println("C2 ==> " + c2.toString() + " ==> " + c2.hashCode());
		MyContact contact = ctx.getBean(MyContact.class);
		System.out.println("contact ==> " + contact.toString() );


		BankService serv = ctx.getBean(BankService.class);
		 serv.deposit(2000.0d);
		System.out.println("End ==> " );

	}

}
