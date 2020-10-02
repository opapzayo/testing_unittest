package com.unittest.testing;
public class Fahrenheit {
	private double Celcius;
	private double Fahnrenhiet;
	public double getCelcius() {
		return Celcius;
	}
	public void input(double Celcius) {
		this.Celcius = Celcius;
	}

	
	public double getFahnrenhiet() {
		return Fahnrenhiet;
	}

	public boolean isBound(double Celcius) {
		boolean isResult;
		if(Celcius >= -1000 && Celcius <= 1000) {
			isResult = true;
		}else{
			isResult = false;
		}
		return isResult;
	}
	public void calculate() {
		this.Fahnrenhiet = this.Celcius*9/5+32;
	}
	public String toString() {
		double Fahnrenhiet = this.getFahnrenhiet();
		double Celcius = this.getCelcius();
		return Math.round(Celcius)+" Celcius = "+String.format("%.2f",Fahnrenhiet)+" Fahrenheit";
	}
}