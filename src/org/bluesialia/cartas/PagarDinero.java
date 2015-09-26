package org.bluesialia.cartas;

import org.bluesialia.casillas.Parking;
import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.exceptions.ImprisonedException;
import org.bluesialia.individuos.Banca;
import org.bluesialia.listas.ListaJugadores;

public class PagarDinero extends CartaDinero {

	// Constructora
	/**
	 * Crea un objeto de tipo PagarDinero.
	 * @param pDescripcion : String - Descripcion de PagarDinero.
	 * @param pDinero : int - Dinero a pagar.
	 */
	public PagarDinero(String pDescripcion, int pDinero) {
		super(pDescripcion, pDinero);
	}
	
	// Métodos
	/**
	 * Se muestra por pantalla la descripcion, el jugador con identificador pId paga a la Banca el dinero y se acumula en Parking.
	 * @throws ImprisonedException 
	 * @throws BankruptcyException 
	 */
	@Override
	public void ejecutarCarta(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCarta(pId);
		Parking.acumular(this.getDinero());
		ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId).pagarAJugador(this.getDinero(), Banca.getMiBanca().getIdentificador());
	}
}
