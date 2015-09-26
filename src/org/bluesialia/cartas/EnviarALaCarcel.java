package org.bluesialia.cartas;

import org.bluesialia.casillas.Carcel;
import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.individuos.Jugador;
import org.bluesialia.listas.ListaJugadores;
import org.bluesialia.exceptions.ImprisonedException;

public class EnviarALaCarcel extends Desplazar {

	// Constructora
	/**
	 * Crea un objeto de tipo EnviarALaCarcel.
	 * @param pDescripcion : String - Descripcion de EnviarALaCarcel.
	 */
	public EnviarALaCarcel(String pDescripcion) {
		super(pDescripcion, Carcel.getMiCarcel().getPosicion());
	}
	
	// Métodos
	public void ejecutarCarta(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCarta(pId);
		
		Jugador pJugador = ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId);
		
		pJugador.enviarALaCarcel();
	}
}