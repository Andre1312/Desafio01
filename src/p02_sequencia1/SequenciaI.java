package p02_sequencia1;

/**
 * @author Andre L C Barros
 * @version v01
 * Calcula Sequencia
 * 
 * A= N + (N-1)/2 + (N-2)/3 + ... + 1/N
 * 
 */

import java.util.Scanner;

public class SequenciaI {

	public static void main(String[] args) {

		mostraValorSeq(entradaDado());

	}

	/**
	 * mostraValorSeq - Calcula Sequencia
	 * A= N + (N-1)/2 + (N-2)/3 + ... + 1/N
	 * 
	 * A = somatorio de (N-i)/(i-1) com i[0 .. N-1]
	 * 
	 * @param valor double
	 * 
	 */

	private static void mostraValorSeq(double valor) {
		// 
		double a=0;

		for (int i=0; i<=(valor-1); i++) {
			a += ((valor - i)/(i+1));
		}
		System.out.println("Para N = " + valor + "\t A = " + a);


	}
	/**
	 * entradaDado - recebe do Teclado valor dupla precisão
	 * 
	 * @param n double : teclado
	 * @return n double
	 */

	private static double entradaDado() {
		// 

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite valor para cálculo da sequencia: ");
		double n = sc.nextDouble();
		sc.close();
		return n;
	}



}
