package classe;

//import java.sql.Date;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@zmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@zmail.com";

		System.out.println(u1 == u2); // Nesse comparativo vai retornar "false"porque são 2 objetos diferentes na
										// memória
		System.out.println(u1.equals(u2)); // O equals vai fazer o mesmo de cima
		System.out.println(u2.equals(u1)); // O equals vai fazer o mesmo de cima

//		System.out.println(u2.equals(new Date(0)));

	}

}
