package webServices;

import pojos.BugJira;

public class CreateBugJira {
	BugJira bodyBug = new BugJira();

	public BugJira setInfoBodyJira() {
		bodyBug.setKey("TEST");
		bodyBug.setSummary("Issue");
		bodyBug.setDescription(
				"User (user) with jobposition (job) and ID (ID) found a defect related to bootcamp academy");
		bodyBug.setName("Bug");
		return bodyBug;
	}

	public BugJira setInfoBodyMock(String description, String summary) {
		bodyBug.setKey("TEST");
		bodyBug.setSummary(summary);
		bodyBug.setDescription(description);
		bodyBug.setName("Bug");
		return bodyBug;
	}

}
