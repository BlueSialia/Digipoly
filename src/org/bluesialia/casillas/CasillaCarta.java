package org.bluesialia.casillas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.exceptions.ImprisonedException;

public abstract class CasillaCarta extends Casilla {
	
	// Constructora
	/**
	 * Crea un objeto de tipo CasillaCarta.
	 * @param pNombre : String - Nombre de CasillaCarta.
	 */
	public CasillaCarta(String pNombre) {
		super(pNombre);
	}
	
	// Métodos
	public void ejecutarCasilla(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCasilla(pId);
	}
}
