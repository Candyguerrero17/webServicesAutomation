package utils.constans;

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
