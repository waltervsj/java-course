package application;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Store {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirthday = Client.simpleDateFormat.parse(sc.next());
		
		Client client = new Client(clientName, clientEmail, clientBirthday);
		
		System.out.println("Enter order data:");
		
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		
		System.out.print("How many items to this order? ");
		Integer iterationsQuantity = sc.nextInt();
		
		Order order = new Order(new Date(), orderStatus, client);
		
		for (int iterator = 0; iterator < iterationsQuantity; iterator ++) {
			System.out.println("Enter #" + (iterator + 1) + " item data: ");
			
			System.out.print("Product name: ");
			String productName = sc.next();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer orderItemQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(orderItemQuantity, productPrice, new Product(productName, productPrice));
			
			order.addItem(orderItem);
		}
		
		System.out.println("ORDER SUMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
