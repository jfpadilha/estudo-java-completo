package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String v = JOptionPane.showInputDialog("Numero:");
		int n = Integer.parseInt(v);

		if (n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
