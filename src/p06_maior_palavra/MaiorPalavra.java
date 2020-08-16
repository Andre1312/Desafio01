package p06_maior_palavra;

/**
 * 
 * @author Andre L C Barros - 
 * 
 * Recebe uma frase qualquer informada via teclado e imprime a maior palavra desta
 * frase, caso exista mais de uma palavra com a mesma quantidade de letras da maior exibir a primeira
 * encontrada.
 *
 *
 */

import java.util.Scanner;

public class MaiorPalavra {


	public static void main(String[] args) {
		// 
		mostraMaiorPalavra(entradaTexto());
	}

	private static void mostraMaiorPalavra(String texto) {
		//
		
		String[] palavras = texto.split(" ");
		
		String maiorPalavra = "";
		
		
        
		for (String palavra : palavras) {
			
			if (palavra.length() > maiorPalavra.length()) {
	              maiorPalavra = palavra;
	          }
			
		}
		
		System.out.println(maiorPalavra+" é a mais longa palavra com "+maiorPalavra.length()+" caracteres");
		
        
	}
	



	/**
	 * Retorna texto do teclado
	 * @param texto String : teclado
	 * @return texto String
	 * @return
	 */
	private static String entradaTexto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite pequeno texto: ");
		String texto = sc.nextLine();
		//texto = texto.toUpperCase();
		System.out.println(texto);
		return texto;
	}
}



