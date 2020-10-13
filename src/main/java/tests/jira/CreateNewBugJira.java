package tests.jira;

import org.testng.Assert;
import org.testng.annotations.Test;

import webServices.CreateBugJira;
import webServices.WebServiceJira;

public class CreateNewBugJira extends WebServiceJira{
	private CreateBugJira bodyBug = new CreateBugJira();
	/**
	 * Create new bug in jira
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(priority = 4)
	public void createNewBug() throws InterruptedException {
		int statusCode = requestPostWithtAuthorization(bodyBug.setInfoBodyJira()).getStatusCode();
		Assert.assertEquals(statusCode, 201);
	}
}
