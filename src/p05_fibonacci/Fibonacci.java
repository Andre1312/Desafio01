package p05_fibonacci;

import java.util.Scanner;

/**
 * 
 * @author Andre L C Barros - 
 * 
 * série de Fibonacci com N termos, o valor de N será informado como
 * entrada em uma variável inteira.
 *
 */

public class Fibonacci {

	public static void main(String[] args) {
		//
		mostraSerieFibonacci(entradaDado());

	}
	/**
	 * Mostra serie Fibonacci para um número 
	 * @param entradaDado int
	 * 
	 */
	private static void mostraSerieFibonacci(int entradaDado) {
		//
		int n = entradaDado;
		int fib = 1;
		//
		System.out.print(n+" :"+"\t");
		//
		for (int i=1; i<=n;i++) {
			fib = calcFibonacci(i);
			System.out.print(fib+" ");
		}


	}
	/**
	 * Função recursiva para calculo da serie fibonacci para um numero num - 
	 * calcFibonacci(int num)
	 * @param num int
	 * @return calcFibonacci(num-1)+calcFibonacci(num-2) int
	 */

	private static int calcFibonacci(int num) {
		// 
		if (num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
		return calcFibonacci(num-1)+calcFibonacci(num-2);
	}
	/**
	 * entradaDado - recebe do Teclado valor inteiro
	 * @param n int : teclado
	 * @return n int
	 */
	private static int entradaDado() {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite valor para cálculo da sequencia: ");
		int n = sc.nextInt();
		sc.close();
		return n;
	}


}
