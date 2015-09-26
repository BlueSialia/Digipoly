package org.bluesialia.cartas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.exceptions.ImprisonedException;
import org.bluesialia.individuos.Jugador;
import org.bluesialia.listas.ListaJugadores;

public abstract class Carta {

	// Atributos
	protected String descripcion;

	// Constructora
	/**
	 * Crea un objeto de tipo Carta.
	 * @param pDescripcion : String - Descripcion de la Carta.
	 */
	public Carta(String pDescripcion) {
		this.descripcion = pDescripcion;
	}

	// Getters
	/**
	 * @return la descripcion de la carta.
	 */
	public String getDescripcion() {
		return this.descripcion;
	}

	// Métodos
	/**
	 * Se muestra por pantalla la descripcion.
	 * @param pId : int - Id del Jugador que ha cojido la Carta.
	 * @throws ImprisonedException 
	 * @throws BankruptcyException 
	 */
	public void ejecutarCarta(int pId) throws ImprisonedException, BankruptcyException {
		Jugador pJugador = ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId);
		
		System.out.println("El jugador " + pJugador.getNombre() + " coge una carta que dice:");
		System.out.println(this.getDescripcion());
	}
}
