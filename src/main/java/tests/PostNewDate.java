package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import webServices.CreateCustomers;

public class PostNewDate {
	@Test()
	public void postNewDate() throws IllegalArgumentException, IllegalAccessException {

		CreateCustomers data = new CreateCustomers();
		int statusCode = data.createDataPojoWebService().getStatusCode();
		assertEquals(statusCode, 201);

	}

}
