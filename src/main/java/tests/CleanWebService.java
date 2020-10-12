package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import webServices.BaseWebServices;

public class CleanWebService extends BaseWebServices {

	@Test()
	public void deleteInfoEndpoint() throws InterruptedException {
		requestDeleteAllItems();
		assertTrue(isEmptyEndpoint());
	}




}
