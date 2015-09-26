package org.bluesialia.casillas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.individuos.Jugador;
import org.bluesialia.listas.ListaJugadores;
import org.bluesialia.exceptions.ImprisonedException;

public class VeALaCarcel extends Casilla {

	// Constructora
	/**
	 * Crea un objeto de tipo VeALaCarcel con "Ve a la cárcel" como nombre.
	 */
	public VeALaCarcel() {
		super("Ve a la cárcel");
	}

	// Métodos
	/**
	 * Envía a la carcel al jugador.
	 * @param pId : int - Id del Jugador en VeALaCarcel.
	 * @throws ImprisonedException 
	 * @throws org.bluesialia.exceptions.BankruptcyException
	 */
	@Override
	public void ejecutarCasilla(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCasilla(pId);
		Jugador pJugador = ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId);

		pJugador.enviarALaCarcel();
	}
}
