package com.example.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dependency.controllers.ConstructorInjectedController;
import com.example.dependency.controllers.MyController;
import com.example.dependency.controllers.PropertyInjectedController;
import com.example.dependency.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DependencyApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
		
		
		System.out.println("__________Property ");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("__________Setter ");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());	
		
		System.out.println("__________Controller ");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
