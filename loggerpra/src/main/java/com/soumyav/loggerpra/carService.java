package com.soumyav.loggerpra;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class carService {
	private final Logger log =LoggerFactory.getLogger(carService.class);
public void process(String input) {
	log.debug("processing car:{}",input);
}
}
