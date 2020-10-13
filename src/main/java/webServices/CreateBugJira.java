package webServices;

import pojos.BugJira;
/**
 * Description: Set of Bug jira
 *
 */
public class CreateBugJira {
	BugJira bodyBug = new BugJira();
	public static final String KEY = "TEST";
	public static final String ISSUE = "Issue";
	public static final String DESCRIPTION = "User Candy Guerrero with jobposition TAI  found a defect related to bootcamp academy";
	public static final String NAME = "Bug";

	/**
	 * The method does the sets wih info to create bug
	 * 
	 * @return info
	 * 
	 * 
	 */
	public BugJira setInfoBodyJira() {
		bodyBug.setKey(KEY);
		bodyBug.setSummary(ISSUE);
		bodyBug.setDescription(DESCRIPTION	);
		bodyBug.setName(NAME);
		return bodyBug;
	}
	/**
	 * The method does the sets with  info got of mock API
	 * 
	 * @return info
	 * 
	 * 
	 */
	public BugJira setInfoBodyMock(String description, String summary) {
		bodyBug.setKey(KEY);
		bodyBug.setSummary(summary);
		bodyBug.setDescription(description);
		bodyBug.setName(NAME);
		return bodyBug;
	}

}
