package controle;

/**
 * Exemplo de Break usando rotulo
 * 
 * Não é recomendado utilizar esse tipo de break
 * 
 * O break vai sair do bloco quando encontrar o valor do "if", saindo do bloco
 * identificado
 * 
 * Adicionando linha para commit #78
 * 
 * @author joao
 *
 */ 

public class BreakRotulado {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 3; i++) { // rotulando o bloco
			for (int j = 0; j < 3; j++) {

				if (i == 1)
					break externo; // vai executar o break do rótulo

				System.out.printf("%d %d\n", i, j);
			}

		}
		System.out.println("Saiu");
	}

}
