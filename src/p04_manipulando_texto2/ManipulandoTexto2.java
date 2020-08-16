package p04_manipulando_texto2;

import java.util.Scanner;

/**
 * 
 * @author Andre L C Barros - 
 * 
 * Recebe uma frase qualquer informada via teclado e imprima a quantidade de
 * PALAVRAS existentes na frase
 *
 */



public class ManipulandoTexto2 {

	public static void main(String[] args) {
		//
		contaPalavras(entradaTexto());
	}
	
	
	/**
	 * Conta Palavra entre espaços num texto
	 * Mostra na tela total de palavras
	 * @param texto string
	 */
	private static void contaPalavras(String texto) {
		// 
		if (texto==null || texto.isEmpty()){
			return ;
		}
		// inicializa contador e zera, flag se eh palavra eh false
		int contaPalavra = 0;
		boolean ehPalavra = false;
		//
		for(int i=0; i<texto.length(); i++){
			//
			// se eh espaço , não ehPalavra
			if (texto.charAt(i)==' ') {
				ehPalavra = false;
			}else if (ehPalavra == false){
				// 
				// se não eh espaço, ehPalavra e incrementa contador de palavras
				ehPalavra = true;
				contaPalavra++;
			}
		}
		System.out.println("TOTAL DE PALAVRAS = "+contaPalavra);
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
