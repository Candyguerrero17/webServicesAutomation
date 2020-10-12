package tests.jira;

import org.testng.Assert;
import org.testng.annotations.Test;

import static utils.constans.Parameters.TOTAL;

import static utils.constans.Enpoints.SEARCH;
import static utils.constans.Enpoints.ISSUE;
import webServices.CreateBugJira;
import webServices.WebServiceJira;

public class LastIdCreatedJira extends WebServiceJira{
	
	private CreateBugJira dataBug = new CreateBugJira();
	@Test()
	public void createNewBugJira() throws InterruptedException {
		int idtotals = requestGetSizeJson(SEARCH.getText(),TOTAL.getText());
		requestPostWithtAuthorization(dataBug.setInfoBodyJira());
		int statusCode = requestGet(ISSUE.getText(),idtotals-1).getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
}
