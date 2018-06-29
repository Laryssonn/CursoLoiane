
public class Contatos {
	String nome;
	String telefone;
	String email;

	public Contatos(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	public void mostrarContato(){
		
		System.out.println("Nome: "+nome);
		System.out.println("Telefone: "+telefone);
		System.out.println("Email: "+ email);
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
