package tests.jira;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import static utils.constans.Parameters.NAME;
import static utils.constans.Parameters.TRANSACTION;
import webServices.CreateBugJira;
import webServices.WebServiceJira;

public class NewJiraDefectMockApi extends WebServiceJira {
	CreateBugJira bodyBug = new CreateBugJira();
	/**
	 * Create and sent post with info of MockApi
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(priority = 6)
	public void newBugWithMockeApi() {
		String description = requestGetWithInfoMethod(1, NAME.getText());
		String summary = requestGetWithInfoMethod(1, TRANSACTION.getText());
		int statuCode = requestPostWithtAuthorization(bodyBug.setInfoBodyMock(description, summary)).getStatusCode();
		assertEquals(statuCode, 201);
	}
}
