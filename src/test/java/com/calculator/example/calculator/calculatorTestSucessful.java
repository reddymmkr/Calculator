package com.calculator.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
	
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import com.calculator.example.calculator.calculator;

public class calculatorTestSucessful {
	   
	private static calculator calculator;
	   
	
	
	public static void initCalculator() {
		
		 calculator = new calculator();
		 
	}
	
	
	@Before
	
	public void beforeEachTest() {
		
		System.out.println("This is executed before each Test");
		
	}
	
	@After
	
	public void afterEachTest() {
		
		System.out.println("This is executed after each Test");
		
	}
	
	
	
	
}