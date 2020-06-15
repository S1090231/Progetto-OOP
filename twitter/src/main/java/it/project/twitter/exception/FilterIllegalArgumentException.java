package it.project.twitter.exception;

public class FilterIllegalArgumentException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;

	public FilterIllegalArgumentException() {
		super();
	}

	public FilterIllegalArgumentException(String messaggio) {
		super(messaggio);
	}
}
