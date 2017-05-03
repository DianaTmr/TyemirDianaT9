package exceptions;

@SuppressWarnings("serial")
public class ListSizeOverflownException extends RuntimeException {
	public ListSizeOverflownException(String mensaje) {
		super(mensaje);
	}
}
