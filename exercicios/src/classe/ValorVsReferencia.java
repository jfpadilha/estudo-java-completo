package classe;

/**
 * #103. Atribuição: Valor vs Referência #02
 * 
 * @author joao
 *
 */

public class ValorVsReferencia {
	public static void main(String[] args) {

		double a = 2;
		double b = a; // atribuição por valor

		a++;
		b--;

		System.out.printf("A: %f\nB: %f\n\n", a, b);

		Data d1 = new Data(1, 6, 2020);
		Data d2 = d1; // atribuição por referência (objeto)

		d1.dia = 31;
		d2.mes = 12;

		d1.ano = 2025;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}

	static void voltarParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}
}
