package com.soumyav.loggerpra;

import org.junit.Test;

public class carServiceTest {
	@Test
	public void shouldDemonstrateLogging() {
		carService carservice= new carService();
		carservice.process("BMW");
}
}
