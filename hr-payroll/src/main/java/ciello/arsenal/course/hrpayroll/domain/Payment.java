package ciello.arsenal.course.hrpayroll.domain;

import java.io.Serializable;

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Double dailyInCome;
	private int days;
	
	public Payment() {}


	public Payment(String name, Double dailyInCome, int days) {
		super();
		this.name = name;
		this.dailyInCome = dailyInCome;
		this.days = days;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getDailyInCome() {
		return dailyInCome;
	}


	public void setDailyInCome(Double dailyInCome) {
		this.dailyInCome = dailyInCome;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyInCome;
	}
}
