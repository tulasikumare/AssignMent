package com.assignment.TestScripts;

import org.testng.annotations.Test;

import com.assignment.Lib.BaseTest;
import com.assignment.Pages.IphonePriceComparison;

public class IphonePriceComparisonTest extends BaseTest{
	@Test()
	public void iphonePriceInAmazonAndFlipkartTest() 
	{	// creating object for Iphone price comparison POM class
		IphonePriceComparison price =new IphonePriceComparison(driver);
	
			price.iphonePriceInAmazonAndFlipkart();
		
	}
}
