package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {

		double media = 5;
		String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
//		VARIAVEL = MEDIA "se for maior ou igual a 7" PRIMEIRA CONDICAO ":" SEGUNDA CONDICAO

		String result = media >= 7.0 ? "aprovado" : media >= 5 ? "em recuperação" : "reprovado";
//		VARIAVEL = MEDIA "se for maior ou igual a 7" PRIMEIRA CONDICAO ":" SEGUNDA CONDICAO

		System.out.println(resultado);
		System.out.println(result);

	}

}
