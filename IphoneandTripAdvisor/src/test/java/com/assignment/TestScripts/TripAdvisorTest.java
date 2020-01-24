package com.assignment.TestScripts;

import org.testng.annotations.Test;

import com.assignment.Lib.BaseTest;
import com.assignment.Pages.TripAdvisor;


public class TripAdvisorTest extends BaseTest{
	@Test
	public void script()
	{	// creating object for pAdvisor  POM class
		TripAdvisor adv=new TripAdvisor(driver);
		adv.tripAdvisor1();
	}

} 
