package models;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import exceptions.ElementNotAllowedException;
import exceptions.ListSizeOverflownException;

@SuppressWarnings("serial")
public class ListaOrdenada<E> extends PriorityQueue<E> {

	private final byte MAX_SIZE = 100;

	public ListaOrdenada(Comparator<E> comp) {
		super(comp);
	}

	public boolean add(E elemento) throws ElementNotAllowedException, ListSizeOverflownException {
		if (elemento != null) {
			// Si contiene menos de 100 elementos, añade, si no lanza excepción
			if (this.size() <= MAX_SIZE) {
				return super.add(elemento);
			} else {
				throw new ListSizeOverflownException("Cola llena, máximo 100 elementos.");
			}
		} else {
			throw new ElementNotAllowedException("No pueden haber valores NULL.");
		}
	}

	public boolean addAll(Collection<? extends E> collection)
			throws ElementNotAllowedException, ListSizeOverflownException {
		if (collection.size() + this.size() <= MAX_SIZE) {
			return super.addAll(collection);
		} else {
			throw new ListSizeOverflownException("Cola llena, máximo 100 elementos.");
		}
	}
}
