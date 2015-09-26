package org.bluesialia.casillas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.exceptions.ImprisonedException;
import org.bluesialia.individuos.Banca;
import org.bluesialia.individuos.Jugador;
import org.bluesialia.listas.ListaJugadores;

public class Multa extends Casilla {

	// Atributos
	private int multa;

	// Constructora
	/**
	 * Crea un objeto de tipo Multa.
	 * @param pNombre : String - Nombre de la Multa.
	 * @param pMulta : int - Precio de la Multa.
	 */
	public Multa(String pNombre, int pMulta) {
		super(pNombre);
		this.multa = pMulta;
	}

	// Getters
	/**
	 * @return la multa.
	 */
	public int getMulta() {
		return this.multa;
	}

	// Métodos
	/**
	 * El jugador paga la multa y se acumula el dinero en el parking.
	 * @throws BankruptcyException 
	 * @throws ImprisonedException 
	 */
	@Override
	public void ejecutarCasilla(int pId) throws BankruptcyException, ImprisonedException {
		super.ejecutarCasilla(pId);
		Jugador multado = ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId);
		
		Parking.acumular(this.getMulta());
		multado.pagarAJugador(this.getMulta(), Banca.getMiBanca().getIdentificador());
	}
}
