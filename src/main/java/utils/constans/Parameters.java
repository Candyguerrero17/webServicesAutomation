package utils.constans;

public enum Parameters {

	TOTAL("total"),
	NAME("name"),
	TRANSACTION("transactionType"),
	EMAIL("email");

	    private String text;

	    private Parameters(String text){
	      this.text = text;
	    }

	    public String getText() {
	      return text;
	    }
}
