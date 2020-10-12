package utils.constans;

public enum Token {

	TOKEN("Y2FuZHlndWVtZUBob3RtYWlsLmNvbTp2Mzg3cm1RVUN3MU9COHZlemp6ZzMwOTU=");

	private String text;

	private Token(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
