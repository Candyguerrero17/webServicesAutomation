package utils.constans;

public enum Messages {

	DUPLICATE("Start validation of emails"),
	DUPLICATE_OK("The email already exists.");

	    private String text;

	    private Messages(String text){
	      this.text = text;
	    }

	    public String getText() {
	      return text;
	    }
}
