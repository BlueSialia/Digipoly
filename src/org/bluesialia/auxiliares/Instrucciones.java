package org.bluesialia.auxiliares;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.bluesialia.exceptions.WrongInstructionException;
import org.bluesialia.listas.Tablero;

public class Instrucciones {

	// Métodos
	/**
	 * Recoge por teclado un número entre min y max (ambos incluidos).
	 * @param min : int
	 * @param max : int
	 * @return un número entre min y max (ambos incluidos).
	 */
	public static int recogerNumeroEntre(int min, int max) {
		Scanner teclado = new Scanner(System.in);
		try {
            int num = teclado.nextInt();
            if (num < min || max < num) {
				throw new WrongInstructionException("Número no válido, introduzca otro.");
			} else {
				return num;
			}
		} catch (WrongInstructionException e) {
			System.out.println(e.getMessage());
			return recogerNumeroEntre(min, max);
		} catch (InputMismatchException e) {
            System.out.println("Escribe un número.");
            return recogerNumeroEntre(min, max);
        } catch (Exception e) {
			System.out.println("Objeto inválido.");
			return recogerNumeroEntre(min, max);
		}
	}

	/**
	 * Recoge por teclado un número entre 0 y el tamaño del tablero (ambos incluidos).
	 * @return un número entre 0 y el tamaño del tablero (ambos incluidos).
	 */
	public static int recogerPosicion() {
		return recogerNumeroEntre(0, Tablero.getMiTablero().getTamanyo());
	}

	/**
	 * Recoge por teclado un carácter 'S', 's', 'N' o 'n'.
	 * @return true si el carater es 'S' o 's' y false si es 'N' o 'n'.
	 */
	public static boolean recogerConfirmacion() {
		Scanner teclado = new Scanner(System.in);
		char letra = teclado.next().charAt(0);
		try {
			if (letra != 'S' && letra != 's' && letra != 'N' && letra != 'n') {
				throw new WrongInstructionException("Letra no válida, introduzca 'S' o 'N'.");
			} else {
				return (letra == 'S' || letra == 's');
			}
		} catch (WrongInstructionException e) {
			System.out.println(e.getMessage());
			return recogerConfirmacion();
		}
	}

	/**
	 * Recoge por teclado un nombre válido.
	 * @return el nombre escrito.
	 */
	public static String recogerNombre() {
		Scanner teclado = new Scanner(System.in);
        return teclado.next();
	}
}
