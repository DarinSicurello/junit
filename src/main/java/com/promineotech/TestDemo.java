package com.promineotech;

public class TestDemo {

	//Wk 12 Q a. b . Create an instance method, 
	//if both parameters are positive (greater than zero) return the sum of the parameters. If either parameter is zero or negative, throw an IllegalArgumentException with the message "Both parameters must be positive!"
	
	public int addPositive(int a, int b) {}
	 if (a <= 0 || b <= 0) {
	        throw new IllegalArgumentException("Both parameters must be positive!");
	    }
	    return a + b;
}
