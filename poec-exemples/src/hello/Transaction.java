package hello;

import java.math.BigDecimal;

public  class Transaction {

	private String type;
	private BigDecimal amount;
	//BigDecimal amount = new BigDecimal(0);
	public Transaction(String type,BigDecimal amount) {
		this.type = type;
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	} 
		
}
