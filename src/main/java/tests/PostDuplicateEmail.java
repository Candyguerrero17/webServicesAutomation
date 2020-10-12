package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.constans.Parameters.EMAIL;
import static utils.constans.Messages.DUPLICATE_OK;
import webServices.BaseWebServices;

public class PostDuplicateEmail extends BaseWebServices {
	@Test()
	public void mailAlreadyExists() {
		String message = requestPostWithDataDuplicate(1,EMAIL.getText());
		Assert.assertEquals(message, DUPLICATE_OK.getText());
	}
}
