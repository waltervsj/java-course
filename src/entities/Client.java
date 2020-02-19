package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthDate;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Client() {
	}
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + Client.simpleDateFormat.format(this.birthDate) + ")" + " - " + this.email;
	}
}
