package it.project.twitter.exception;

public class FilterNotFoundException extends ClassNotFoundException {
	private static final long serialVersionUID = 2L;

	public FilterNotFoundException() {
		super();
	}

	public FilterNotFoundException(String messaggio) {
		super(messaggio);
	}
}
