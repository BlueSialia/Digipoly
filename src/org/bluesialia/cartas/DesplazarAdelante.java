package org.bluesialia.cartas;

import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.exceptions.ImprisonedException;
import org.bluesialia.individuos.Jugador;
import org.bluesialia.listas.ListaJugadores;

public class DesplazarAdelante extends Desplazar {

	// Constructora
	/**
	 * Crea un objeto de tipo DesplazarAdelante.
	 * @param pDescripcion : String - Descripcion de DesplazarAdelante.
	 * @param pPosicion : int - Posiciones que desplaza hacia adelante.
	 */
	public DesplazarAdelante(String pDescripcion, int pPosicion) {
		super(pDescripcion, pPosicion);
	}

	// Métodos
	public void ejecutarCarta(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCarta(pId);
		
		Jugador pJugador = ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId);
		
		pJugador.desplazarA(pJugador.getPosicion() + this.getPosicion());
	}
}
