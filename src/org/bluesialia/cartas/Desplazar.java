package org.bluesialia.cartas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.exceptions.ImprisonedException;

public abstract class Desplazar extends Carta {

	// Atributos
	private int posicion;

	// Constructora
	/**
	 * Crea un objeto de tipo Desplazar.
	 * @param pDescripcion : String - Descripcion de Desplazar.
	 * @param pPosicion : int
	 */
	public Desplazar(String pDescripcion, int pPosicion) {
		super(pDescripcion);
		this.posicion = pPosicion;
	}
	
	// Getters
	/**
	 * @return la posicion
	 */
	public int getPosicion() {
		return this.posicion;
	}
	
	// Métodos
	public void ejecutarCarta(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCarta(pId);
	}
}