package exceptions;

@SuppressWarnings("serial")
public class ElementNotAllowedException extends NullPointerException {
	public ElementNotAllowedException(String mensaje) {
		super(mensaje);
	}
}
