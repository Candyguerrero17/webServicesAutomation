package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.constans.Parameters.EMAIL;
import static utils.constans.Messages.DUPLICATE_OK;
import webServices.BaseWebServices;

public class PostDuplicateEmail extends BaseWebServices {
	/**
	 * Before to send post , it has a questios if email exits no allow to send. 
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(priority = 3)
	public void mailAlreadyExists() {
		
		String newEmail = requestGetWithInfoMethod(1, EMAIL.getText());
		String message = requestPostWithDataDuplicate(newEmail);
		Assert.assertEquals(message, DUPLICATE_OK.getText());
	}
}
