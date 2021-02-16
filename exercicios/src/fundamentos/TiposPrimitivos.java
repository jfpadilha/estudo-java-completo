package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Informacoes de funcionarios
		
		//Tipos numericos
		byte anoDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 5_234_845_223L; //literal maior que o int usar "L"
		
		//Tipos numericos reais
		float salario = 11_445.44F; //literal double em float "F"
		double vendasAcumuladas = 2_991_797_103.01;
		
		//TIpos booleano
		boolean estaDeFerias = false;
		
		//Tipo primitivo caractere
		char status = 'A';
		char status2 = '\u0153'; //caractere unicode
		
		//Calc dias de empresa:
		System.out.println(anoDeEmpresa * 365 + " dias");
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2 + " viagens");
		
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas + " pontos por real");
		
		// usando o ID
		System.out.println(id + "ganha-> " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Ativo ou Inativo: " + status);
		System.out.println(status2);
		

	}
}
