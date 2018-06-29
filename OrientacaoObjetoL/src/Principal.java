
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double reslt = Calculadora.calcularFatorial(6);
		
		System.out.println(reslt);
		
		
		Contador contador = new Contador();
		Contador contador1 = new Contador();
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();
		
		Contador.incrementarCont();
		Contador.incrementarCont();
		System.out.println(Contador.getContador());
		Contador.zerarCont();
		System.out.println();
		System.out.println(Contador.getContador());
		System.out.println();
	}

}
