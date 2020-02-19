package entities.enums;

public enum OrderStatus {
	PENDING_PAYMENT(1),
	PROCESSING(2),
	SHIPED(3),
	DELIVERED(4);

	private int status;

	public double getStatus(){
		return this.status;
	}
	  
	OrderStatus(int status){
		this.status = status;
	}
}
