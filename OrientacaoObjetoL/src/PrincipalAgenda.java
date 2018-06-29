
public class PrincipalAgenda {
	public static void main(String[] args){
		Agenda agenda = new Agenda();
		Contatos contato = new Contatos("Larysson","(48)98424-6548","larysson_cb@hotmail.com");
		Contatos contato2 = new Contatos("Lucas","(48)99641-2585","lucas@hotmail.com");
		Contatos contato3 = new Contatos("Carlos","(47)98845-231","carlos_cl@gmail.com");
		Contatos[] contatos = new Contatos[3];
		
		contatos[0] = contato;
		contatos[1] = contato2;
		contatos[2] = contato3;
		
		for(Contatos con: contatos){
			con.mostrarContato();
			System.out.println("");
		}
		
		agenda.setNome("Trabalho");
		agenda.setContato(contatos);
		agenda.retonarAgenda();
		
		
		
	}
}
