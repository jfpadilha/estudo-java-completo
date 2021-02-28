package controle;

import java.util.Iterator;

public class For1 {
	public static void main(String[] args) {

		for (int cont = 0; cont <= 10; cont++) {
			System.out.println("num: " + cont);
		}

		int i = 0;
		for (; i < 10;) {
			System.out.println("i: " + i);
			i++;
		}
		
////		Laço infinito com for
//		for(;;) {
//			System.out.println("exec");
//		} 

	}

}
