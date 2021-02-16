package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Hello world!".charAt(3)); //mostrar a terceira letra
		
		String s = "Loren Ipsum";
		System.out.println(s.concat("!"));
		System.out.println(s + "!");
		
		System.out.println(s.startsWith("ip"));
		System.out.println(s.toLowerCase().startsWith("loren"));
		System.out.println(s.length()); //saber quantos caracteres tem a string
		System.out.println(s.toUpperCase().endsWith("IPSUM")); //checa se termina com IPSUM UpperCase
		System.out.println(s.equals("lorem"));
		System.out.println(s.equalsIgnoreCase("loren ipsum"));
		
		var nome = "Juca";
		var sobrenome = "Silva";
		var idade = 33;
		var salario = 12345.54;
		
		String frase2 = "\nNome: " + nome + "\nSobrenome: " + sobrenome;
		System.out.println(frase2);
		
		//ou outra forma de concatenar
		
		System.out.printf("\nO senhor %s %s tem %s anos e ganha R$ %.2f. salario", 
				nome, sobrenome, idade, salario);
		
//		System.out.println("----");
		
		String frase = String.format("\nO senhor %s %s tem %s anos e ganha R$ %.2f. salario", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		String f1 = "teste qualquer";
		System.out.println(f1.contains("teste"));	//verifica se a string f1 possui "teste"
		System.out.println(f1.indexOf("qualquer"));	//diz qual posicao da letra inicia a palavra qualquer
		System.out.println(f1.substring(6, 10));	//diz qual letra iniciar e qual parar
	}
}
