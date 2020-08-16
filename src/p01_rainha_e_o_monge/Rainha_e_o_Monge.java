package p01_rainha_e_o_monge;

/**
 * @author Andre L C Barros
 * 
 * - versao v01
 * 
 * 
 */



public class Rainha_e_o_Monge {

	public static void main(String[] args) {
		// 
		mostraTotaldeGraos();
	}

	/**
	 * Método mostraTotaldeGraos()
	 * entrada: nenhuma ->
	 * saida1: para cada casa no total de 64 casas, o dobro da casa anterior ->
	 * saida2: para cada casa no total de 64 casas, a soma do acumulado com o dobro da casa anterior ->
	 * 
	 */

	private static void mostraTotaldeGraos() {
		//
		double[] graosDobro = new double[64];
		double[] graosSoma = new double[64];

		double gD = 1;
		double gS = 1;

		for (int i=0;i<64;i++) {

			graosDobro[i]=gD;
			graosSoma[i]=gS;

			System.out.println("Casa: "+(i+1)+" - Qtd: "+graosDobro[i]+" - Soma: "+graosSoma[i]);

			gD *= 2;
			gS = gS + gD;

		}

	}

}
