package utils.constans;
/**
 * Enumm of constans endpoint
 * 
 * @author 
 *
 */
public enum Enpoints {

	CUSTOMER("customer"),
	    GET_CUSTOMER("customer/"),
	    ISSUE("issue/"),
	    SEARCH("search");

	    private String text;

	    private Enpoints(String text){
	      this.text = text;
	    }

	    public String getText() {
	      return text;
	    }
}
