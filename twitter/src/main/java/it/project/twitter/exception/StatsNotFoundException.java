package it.project.twitter.exception;

public class StatsNotFoundException extends ClassNotFoundException {
	private static final long serialVersionUID = 4L;

	public StatsNotFoundException() {
		super();
	}

	public StatsNotFoundException(String messaggio) {
		super(messaggio);
	}

}
