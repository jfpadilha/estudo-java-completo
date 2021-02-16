package fundamentos;

/**
 * Inferência variavel 'var' eh identificada seu tipo pelo conteudo
 * Nao pode alterar o tipo da variavel depois de definir a primeira vez * 
 * 
 * @author joao
 *
 */

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;		
		System.out.println(a);
		
		var b = 4.6;
		System.out.println(b);
		
		var c = "text";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		double d;	//declaracao da variavel
		d = 123.65;	// inicializacao da variavel
		System.out.println(d); 	//uso da variavel
		
		/*
		 * Ja com "var" nao eh possivel fazer esse tipo de declaracao e inicializacao
		 * 
		*/	
		
		var e = 123.67; //deve ser declarada e inicializada na mesma linha

	}
}
