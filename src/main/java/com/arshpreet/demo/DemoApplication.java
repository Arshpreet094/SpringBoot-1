package com.arshpreet.demo;

import com.arshpreet.demo.DependencyInjection.OrderService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//		Student student = context.getBean(Student.class);
//
//		student.setAge(20);
//		student.setName("Rohan");
//
//		System.out.println(student.getAge());
//		System.out.println(student.getName());

		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();

	}

}
