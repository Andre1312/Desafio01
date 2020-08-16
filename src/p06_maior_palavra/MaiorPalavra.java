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
		if (texto==null || texto.isEmpty()){
			return ;
		}
		// inicializa contador e zera, flag ehPalavra=false
		int contaPalavra = 0;
		boolean ehPalavra = false;
		boolean ehLetra = false;
		//
		int contaLetra = 0;
		int inicioLetra = 0;
		String palavra = null;
		
		//
		for(int i=0; i<texto.length(); i++){
			
			// se eh espaço , não ehPalavra
			if (texto.charAt(i)==' ') {
				ehPalavra = false;
						
			}else if (ehPalavra == false){
				
				// se não eh espaço, ehPalavra e incrementa contador de palavras
				ehPalavra = true;
				contaPalavra++;
			}
			//
							
			}
			
		
		System.out.println("Maior Palavra = " + palavra);
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



