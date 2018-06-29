
public class Contador {
	static int cont;
	
	public Contador() {
		incrementarCont();
	}
	public static void incrementarCont(){
		cont++;
	}
	public static void zerarCont(){
		cont =0;
	}
	public static int getContador() {
		return cont;
	}
}
