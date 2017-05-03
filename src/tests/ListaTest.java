package tests;

import org.junit.Test;
import exceptions.ListSizeOverflownException;
import org.junit.Before;
import models.*;

public class ListaTest {

	private ListaOrdenada<Integer> l;

	@Test
	public void AddSuccess() {
		assert (l.add(99));
		assert (l.peek() == 99);
	}

	// Intenta añadir un elemento, si pasa los 100, muestra la excepción, si no,
	// lo añade.
	@Test
	public void AddFail() {
		for (int i = 0; i < 100; i++) {
			l.add(i);
		}
		try {
			l.add(100);
		} catch (ListSizeOverflownException e) {
			assert (l.size() == 100);
			assert (!l.contains(100));
		}
	}

	@Before
	public void Setup() {
		l = new ListaOrdenada<Integer>((Integer a, Integer b) -> b - a);
	}
}
