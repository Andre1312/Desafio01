package p03_manipulando_texto1;

/**
 * 
 * @author Andre L C Barros
 * 
 * 
 * Recebe uma frase qualquer informada via teclado e imprime a quantidade de
 * LETRAS “A” existente na frase
 *
 */

import java.util.Scanner;


public class ManipulandoTexto1 {

	public static void main(String[] args) {
		//

		mostraQtdeLetra(entradaTexto(), entradaLetra());
		

	}
	/**
	 * Conta letras num texto
	 * @param entradaTexto String : texto com letras em maiusculas
	 * @param entradaLetra String : apenas o primeiro caracter
	 */
	private static void mostraQtdeLetra(String entradaTexto, String entradaLetra) {
		//
		String texto = entradaTexto;
		String letra = entradaLetra;
		long cont = 0;
		//
		for (int i=0; i<texto.length() ; i++) {
			
			if(texto.charAt(i) == letra.charAt(0)) {
				cont += 1;
			}
			
			
		}
		System.out.println("TOTAL DE "+letra.charAt(0)+" = "+cont);	
	}
	/**
	 * Retorna letra em maiuscula do teclado
	 * @param letra String : teclado
	 * @return letra String
	 */
	private static String entradaLetra() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Digite letra para contar no texto: ");
		String letra = inp.nextLine();
		letra = letra.toUpperCase();
		System.out.println(letra.charAt(0));
		return letra;
	}
	/**
	 * Retorna texto em maiuscula do teclado
	 * @param texto String : teclado
	 * @return texto String
	 * @return
	 */
	private static String entradaTexto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite pequeno texto: ");
		String texto = sc.nextLine();
		texto = texto.toUpperCase();
		System.out.println(texto);
		return texto;
	}

}
