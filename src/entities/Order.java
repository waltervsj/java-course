package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {	
	}	

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public double total() {
		double result = 0;
		for(OrderItem item : this.items) {
			result += item.subTotal();
		}
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append("Order moment: " + Order.simpleDateFormat.format(this.getMoment()));
		strBuilder.append("\nOrder status: " + this.getStatus());
		strBuilder.append("\nClient: " + this.client);
		strBuilder.append("\nOrder items: " );
		
		for(OrderItem item : this.items) {
			strBuilder.append("\n" + item);
		}
		
		strBuilder.append("\nTotal price: " + String.format("%.2f",this.total()));
		
		return strBuilder.toString();
	}
}
