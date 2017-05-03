package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

import exceptions.ListSizeOverflownException;
import models.*;

public class Main {

	public static void main(String[] args) throws ListSizeOverflownException {
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>((Integer a, Integer b) -> b - a); // Orden descendiente
		// Añadimos elementos a la lista
		lista.add(6424);
		lista.add(8);
		lista.add(14);
		lista.add(2432);

		System.out.println("Elementos: " + lista); // Nos muestra los elementos en orden descendiente
		System.out.println("Menor: " + Collections.min(lista)); // El elemento menor de la lista
		System.out.println("Mayor: " + Collections.max(lista)); // El elemento mayor de la lista

		lista.remove(8); // Aunque se borre algún elemento, sigue permaneciendo en orden descendiente
		System.out.println(lista);
	}

}
