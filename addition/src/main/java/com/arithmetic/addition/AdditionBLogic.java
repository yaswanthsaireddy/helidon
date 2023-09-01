package com.arithmetic.addition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AdditionBLogic {
	
	//Works for addition of 2 as well.
	public int execute(int a, int b, int c)
	{
		System.out.println("The addition of "+a+" and "+b+" is check in the browser or postman");
		return a+b+c;
	}
	
	

}
