package org.bluesialia.casillas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.exceptions.ImprisonedException;
import org.bluesialia.listas.Suerte;

public class CasillaSuerte extends CasillaCarta {

	// Constructora
	/**
	 * Crea un objeto de tipo CasillaSuerte con "Suerte" como nombre.
	 */
	public CasillaSuerte () {
		super("Suerte");
	}
	
	// Métodos
	/**
	 * Coge una carta aleatoria de la lista de cartas Suerte y la ejecuta.
	 * @throws ImprisonedException 
	 * @throws BankruptcyException 
	 */
	public void ejecutarCasilla(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCasilla(pId);
		Suerte.getMiSuerte().cogerCarta().ejecutarCarta(pId);
	}
}
