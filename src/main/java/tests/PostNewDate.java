package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import webServices.BaseTest;

public class PostNewDate extends BaseTest{
	/**
	 * Create info and send post to MockApi
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(priority = 2)
	public void postNewDate() throws IllegalArgumentException, IllegalAccessException {

		int statusCode = data.createDataPojoWebService().getStatusCode();
		assertEquals(statusCode, 201);

	}

}
