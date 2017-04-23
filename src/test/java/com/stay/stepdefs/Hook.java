package com.stay.stepdefs;

import java.util.concurrent.TimeUnit;

import com.stay.utilities.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	
	@Before
	public void setUp(){
		
		//Driver.getInstance().manage().window().maximize();
		Driver.getInstance().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		Driver.closeDriver();
	}

}
