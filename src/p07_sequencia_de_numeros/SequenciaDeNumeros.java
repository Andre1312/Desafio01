package p07_sequencia_de_numeros;

import java.util.Scanner;
import java.math.*;
/**
 * 
 * @author Andre L C Barros - 
 * 
 * calcule o fatorial do número resultado da subtração da soma dos números pares
 * pela soma dos números ímpares existentes no intervalo entre [1 e 50]
 *
 */

public class SequenciaDeNumeros {

	
	public static void main(String[] args) {
		// 
		mostraFatorialDiferencaDaSoma(50);
	}
/**
 * 
 * Retorna fatorial da diferença entre somatorio de numeros pares e somatorio de numeros impares
 * @param limiteSuperior int : limite superior
 */
	private static void mostraFatorialDiferencaDaSoma(int limiteSuperior) {
		//
		int somaPares = 0;
		int somaImpares = 0;
		int subtr = 0;
		//
		for(int i=1; i<=limiteSuperior ;i++){
			if((i % 2)==0){
				somaPares+=i;
			}else{
				somaImpares+=i;
			}
		}
		//Teste variaveis
		//System.out.println("Soma de numeros pares = "+somaPares);
		//System.out.println("Soma de numeros impares = "+somaImpares);
		
		//valor absoluto pois nao existe fatorial de numero negativo
		//valor absoluto pois pode a subtração ser negativa depende do limite superior
		subtr = Math.abs(somaPares - somaImpares);
		
		//Teste subtração
		//System.out.println("Diferença absoluta entre somatorios de pares e impares = " + subtr);
		
		System.out.println("[1 "+ limiteSuperior +"] "+calculaFatorial(subtr));
		
		
	}

	private static int calculaFatorial(int num){
		if (num==0 || num==1){
			return 1;
		}
		return (num* calculaFatorial((num-1)));
	}
}
