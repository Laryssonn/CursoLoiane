
public class Agenda {
	String nome;
	Contatos[] contato;
	
	
	public void retonarAgenda(){
		System.out.println("Agenda: "+ nome);
		for(Contatos cont:contato){
			cont.mostrarContato();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contatos[] getContato() {
		return contato;
	}

	public void setContato(Contatos[] contato) {
		this.contato = contato;
	}
}
