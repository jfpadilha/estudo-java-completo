package classe;

public class Usuario {
	String nome;
	String email;

	/**
	 * implemementando o metodo avancado para "equals" ---> Object eh a classe mae
	 * do java, tudo parte dessa classe
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		} else {
			return false;
		}

//		HashCOde sera abordado em outra aula!

	}

}
