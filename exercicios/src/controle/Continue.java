package controle;

/**
 * Quando chegar no 5 ele volta no começo do for
 * 
 * @author joao
 *
 */

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}
	}
}
