package model;

import java.time.LocalDateTime;

public class Loan {
	private String name;
	private LocalDateTime udate; 
	private int amount;
	private LoanType type;
	public Loan(String name, LocalDateTime localDateTime, int amount, LoanType type) {
		super();
		this.name = name;
		this.udate = localDateTime;
		this.amount = amount;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getUdate() {
		return udate;
	}
	public void setUdate(LocalDateTime udate) {
		this.udate = udate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public LoanType getType() {
		return type;
	}
	public void setType(LoanType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Loan [name=" + name + ", udate=" + udate + ", amount=" + amount + ", type=" + type + "]";
	}
	


}
