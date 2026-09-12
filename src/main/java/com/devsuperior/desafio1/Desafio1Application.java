package com.devsuperior.desafio1;

import com.devsuperior.desafio1.entity.Order;
import com.devsuperior.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
@ComponentScan({"com.devsuperior.desafio1"})
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Order order = new Order(1034, 150.00, 20.0);
		Order order1 = new Order(2282, 800.00, 10.0);
		Order order2 = new Order(1309, 95.90, 0.0);

		System.out.printf("Pedido código %d%nValor total: R$ %.2f%n", order.getCode(), orderService.total(order));
		System.out.println();
		System.out.printf("Pedido código %d%nValor total: R$ %.2f%n", order1.getCode(), orderService.total(order1));
		System.out.println();
		System.out.printf("Pedido código %d%nValor total: R$ %.2f", order2.getCode(), orderService.total(order2));
	}
}
