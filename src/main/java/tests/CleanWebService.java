package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import webServices.BaseWebServices;

public class CleanWebService extends BaseWebServices {
	/**
	 * Search all info in endpoint and delete if exits
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(priority = 1)
	public void deleteInfoEndpoint() throws InterruptedException {
		requestDeleteAllItems();
		assertTrue(isEmptyEndpoint());
	}




}
