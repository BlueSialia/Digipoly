package org.bluesialia.cartas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.exceptions.ImprisonedException;

public abstract class CartaDinero extends Carta {

	// Atributos
	protected int dinero;

	// Constructora
	/**
	 * Crea un objeto de tipo CartaDinero.
	 * @param pDescripcion : String - Descripcion de la CartaDinero.
	 * @param pDinero : int - Dinero de la CartaDinero.
	 */
	public CartaDinero(String pDescripcion, int pDinero) {
		super(pDescripcion);
		this.dinero = pDinero;
	}

	// Getters
	/**
	 * @return el dinero.
	 */
	public int getDinero() {
		return this.dinero;
	}

	// Métodos
	@Override
	public void ejecutarCarta(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCarta(pId);
	}
}
