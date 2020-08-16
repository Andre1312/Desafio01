package p08_raizes_equacao2grau;

import java.util.Scanner;
import java.math.*;
/**
 * 
 * @author Andre L C Barros - 
 * 
 * Achar as raízes de uma equação do segundo grau da forma:
 * ax^2 + bx + c = 0.
 * Serão informados os coeficientes da equação, ou seja, os valores de a, b e c
 *
 */

public class RaizesEquacao2Grau {

	public static void main(String[] args) {
		// 
		mostraRaizesEquacao();

	}

	private static void mostraRaizesEquacao() {
		// 
		int delta = 0;
		double x1 = 0;
		double x2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Para equação 2 grau na forma ax²+bx+c=0\nDigite coeficientes a, b, c: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		//
		delta = ((b*b) - (4* a * c));
		if (delta <0){
			System.out.println("Indeterminadas");
			return;
		}
		x1 = ((-b)- (Math.sqrt(delta))) / (2*a) ;
		x2 = ((-b)+ (Math.sqrt(delta))) / (2*a) ;
		//
		System.out.println("("+a+")X²+("+b+")X+("+c+") : X1 = "+ x1+" e X2 = "+x2 );
		
	}



}
