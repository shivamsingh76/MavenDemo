package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class ExcepEx {

	@Disabled
	@Test
	void testExpection() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Integer.parseInt("abcd");
		});
	}

	@Test
	void testException1() {

		Calculator c = new Calculator();

		final Exception e = assertThrows(ArithmeticException.class, () -> {
			c.searchEmpId(0);

		});

		Assertions.assertEquals("u enetered zero", e.getMessage());
	}

}
