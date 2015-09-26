package org.bluesialia.cartas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.listas.ListaJugadores;
import org.bluesialia.exceptions.ImprisonedException;

public class SalirCarcel extends Carta {

	// Constructora
	/**
	 * Crea un objeto de tipo SalirCarcel.
	 * @param pDescripcion : String - Descripcion de SalirCarcel.
	 */
	public SalirCarcel(String pDescripcion) {
		super(pDescripcion);
	}

	// Métodos
	/**
	 * Se muestra por pantalla la descripcion y añade una cartaDeSalirCarcel al jugador con el identificador pId.
	 * @throws ImprisonedException 
	 * @throws org.bluesialia.exceptions.BankruptcyException
	 */
	public void ejecutarCarta(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCarta(pId);
		ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId).anyadirCartaSalirCarcel();
	}
}
