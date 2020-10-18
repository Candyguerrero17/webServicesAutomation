package utils.constans;
/**
 * Enumm of constans ruls
 * 
 * @author 
 *
 */
public enum Urls {

	BASE_URI_MOCK("https://5f830d736b97440016f4e29b.mockapi.io/api/v1/"),
	BASE_URI_JIRA("https://test-jira-globant.atlassian.net/rest/api/2/");

	    private String text;

	    private Urls(String text){
	      this.text = text;
	    }

	    public String getText() {
	      return text;
	    }
}
