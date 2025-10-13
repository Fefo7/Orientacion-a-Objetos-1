package io.github.unlp_oo.Ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDateLapse {
	private DateLapse date;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		date =  new DateLapse(LocalDate.of(2021, 8, 25),1509);
		
	}
	@Test
	public void TestsizeInDays() 
	{
		assertEquals(date.sizeInDays(),1509);
	}
	@Test
	public void TestincludesDate() 
	{
		assertTrue(date.includesDate(LocalDate.of(2024, 6, 29)));
		assertTrue(date.includesDate(LocalDate.of(2021, 8, 25)));
		assertTrue(date.includesDate(LocalDate.of(2025, 10, 12)));
	}

}
