package org.bluesialia.cartas;

import org.bluesialia.casillas.Salida;
import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.listas.ListaJugadores;
import org.bluesialia.exceptions.ImprisonedException;
import org.bluesialia.individuos.Banca;
import org.bluesialia.individuos.Jugador;

public class DesplazarAPosicion extends Desplazar {

	// Constructora
	/**
	 * Crea un objeto de tipo DesplazarAPosicion.
	 * @param pDescripcion : String - Descripcion de DesplazarAPosicion.
	 * @param pPosicion : int - Posicion a la que desplaza.
	 */
	public DesplazarAPosicion(String pDescripcion, int pPosicion) {
		super(pDescripcion, pPosicion);
	}
	
	// Métodos
	/**
	 * Se muestra por pantalla la descripcion, desplaza al jugador con identificador pId hasta la casilla designada por posicion ejecutándola y le hace cobrar el salario si pasa por la casilla Salida.
	 * @throws ImprisonedException 
	 * @throws org.bluesialia.exceptions.BankruptcyException
	 */
	public void ejecutarCarta(int pId) throws ImprisonedException, BankruptcyException {
		super.ejecutarCarta(pId);
		
		Jugador pJugador = ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId);
		
		if (this.getPosicion() < pJugador.getPosicion()) {
			System.out.println("Pasas por la casilla de Salida.");
			Banca.getMiBanca().pagarAJugador(Salida.getMiSalida().getSalario(), pId);
		}
		pJugador.setPosicion(this.getPosicion());
		pJugador.ejecutarCasilla();
	}
}