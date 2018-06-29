
public class ConversãoDeUnidades {
	
	public static void calcularMetro(double num){
		double result = num * 10.76;
		System.out.println(num+" metro quadrado = "+result+" pés quadrado");
	}
	public static void calcularPe(double num){
		double result = num * 929;
		System.out.println(num+" pé quadrado = "+result+" centimetros quadrado");
	}
	public static void calcularMilha(double num){
		double result = num * 640;
		System.out.println(num+" milha quadrado = "+result+" acres");
	}
	public static void calcularAcre(double num){
		double result = num * 43.560;
		System.out.println(num+" acre = "+result+" pés quadrado");
	}
}
