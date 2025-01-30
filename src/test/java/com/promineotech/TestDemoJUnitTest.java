package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {

	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@Test
	void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(1, 5)).isEqualTo(6);
		assertThat(testDemo.addPositive(4, 6)).isEqualTo(10);
		assertThat(testDemo.addPositive(2, 4)).isEqualTo(6);
		assertThat(testDemo.addPositive(7, 27)).isEqualTo(34);
	}
	// Wk 12 Steps 1 -2 Throw exception is non-positive

	// W 12 1-4 New Method to assert, with exception NEW
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")

	
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {

		if (!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
	}

	@Test
	// wk 12 4A // W 12 1-4 testing method
	// Example test case
	// wk 12 4b
	void assertThatNumberSquaredIsCorrect() {

		TestDemo mockDemo = spy(testDemo);

		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);

	}

	// wk 12 J 1,2,3,4 Create a static method named argumentsForAddPositive
	 static Stream<Arguments> argumentsForAddPositive() {

		return Stream.of(arguments(1, 2, 3, false), // Test case 1: Expecting 1 + 2 = 3, no exception
				arguments(5, 3, 8, false), // Test case 2: Expecting 5 + 3 = 8, no exception
				arguments(5, -3, 0, true), // Test case 3: Expecting exception because one number is negative
				arguments(0, 5, 0, true), // Test case 4: Expecting exception because one number is zero
				arguments(7, 7, 14, false), // Test case 5: Expecting 7 + 7 = 14, no exception
				arguments(2, 4, 6, false));

	}

}
