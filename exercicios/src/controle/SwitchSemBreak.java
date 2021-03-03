package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {

		// if(boolean) ...
		// while(boolean) ...
		// for (;boolean;) ...

		String faixa = "verde";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o bassai-dai");
		case "marrom":
			System.out.println("Sei tekki shodan");
		case "roxa":
			System.out.println("faixa roxa");
		case "verde":
			System.out.println("faixa verde");
		case "laranja":
			System.out.println("fase laranja");
		case "vermelha":
			System.out.println("faixa vermelha");
		case "amarela":
			System.out.println("amarela");
		default:
			System.out.println("nao sabe-se nada");
		}
		
		System.out.println("========================");
		
		int idade = 3;
		
		switch (idade) {
		case 4:
			System.out.println("caso 4");
		case 3:
			System.out.println("caso 3");
		case 2:
			System.out.println("caso 2");
		case 1:
			System.out.println("caso 1");
		}

	}

}
