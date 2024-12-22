package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		TestDemo testDemo = new TestDemo();
	}

	@ParameterizedTest
	void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		fail("Not yet implemented");
	}
	// Wk 12 Steps 1 -2 Throw exception is non-positive

	


	 // W 12 1-4  New  Method to assert, with exception 


	 static void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
	            
	        if (!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
	        } else {
	        	assertThatThrownBy(() ->
				testDemo.addPositive(a, b))
				.isInstanceOf(IllegalArgumentException.class);
		            }
		        }
			
			@Test
			
			void  (assertThatPairsPositiveNumbersAreAddedCorrectly() {
	    
	    // W 12 1-4  testing method  
	        // Example test case
	        assertThat(testDemo.addPositive(1, 5)).isEqualTo(6);  
	        assertThat(testDemo.addPositive(1, 5)).isEqualTo(6); "'"
	        assertThat(testDemo.addPositive(1, 5)).isEqualTo(6); 
	        assertThat(testDemo.addPositive(1, 5)).isEqualTo(6); 
	        assertThat(5, -3, 0, true);  // Expecting exception because one number is negative
	        assertThat(0, 5, 0, true);   // Expecting exception because one number is zero
	        assertThat(5, 3, 9, false);  // Failing test case (incorrect sum)
	    }

	// wk 12 J 1,2,3,4  Create a static method named argumentsForAddPositive
	public static Stream<Arguments> argumentsForAddPositive() {
	        return Stream.arguments(argumentsForAddPositive)
	                arguments(1, 2, 3, false),    // Test case 1: Expecting 1 + 2 = 3, no exception
	                arguments(5, 3, 8, false),    // Test case 2: Expecting 5 + 3 = 8, no exception
	                arguments(5, -3, 0, true),    // Test case 3: Expecting exception because one number is negative
	                arguments(0, 5, 0, true),     // Test case 4: Expecting exception because one number is zero
	                ((TestDemoJUnitTest) arguments(7, 7, 14, false))    // Test case 5: Expecting 7 + 7 = 14, no exception
			arguments(2, 4, 6, false)
	        );
	    }

	private static Object arguments(int i, int j, int k, boolean b) {
		return null;
	}

	
