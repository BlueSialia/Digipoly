package org.bluesialia.casillas;

import org.bluesialia.auxiliares.Dado;
import org.bluesialia.exceptions.BankruptcyException;
import org.bluesialia.individuos.Jugador;
import org.bluesialia.listas.ListaJugadores;

public class ServicioPublico extends Propiedad {

	// Constructora
	/**
	 * Crea un objeto de tipo ServicioPublico con 150 como precio, 0 como alquiler y false como hipotecado.
	 * @param pNombre : String - Nombre del ServicioPublico.
	 */
	public ServicioPublico(String pNombre) {
		super(pNombre, 150, 0, 75);
	}

	// Métodos
	/**
	 * @return la suma de 2 número aleatorios entre 1 y 6.
	 */
	private int alquilerBase() {
		return Dado.getMiDado().tirarDado() + Dado.getMiDado().tirarDado();
	}

	/**
	 * El jugador paga la cantidad correspondiente.
	 * @param pId : int - Id del jugador en el ServicioPublico.
	 * @throws org.bluesialia.exceptions.BankruptcyException
	 */
	@Override
	protected void alquilar(int pId) throws BankruptcyException {
		Jugador alquilado = ListaJugadores.getMiListaJugadores().buscarJugadorPorId(pId),
				comprador = (Jugador) ListaJugadores.getMiListaJugadores().buscarComprador(this.getPosicion());
		int alquilerTotal = (int)(this.alquilerBase() * Math.pow(3, comprador.cantidadDelMismoTipo(this)));
		
		alquilado.pagarAJugador(alquilerTotal, comprador.getIdentificador());
	}
}
