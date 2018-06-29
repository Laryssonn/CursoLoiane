
public class Calculadora {
	
	public static int somarNumeros(int num1,int num2){
		return num1 + num2;
	}
	
	public static int subtrairNumeros(int num1,int num2){
		return num1 - num2;
	}
	
	public static int multiplicarNumeros(int num1,int num2){
		return num1 * num2;
	}
	
	public static double calcularFatorial(double num){
		if(num == 0){
			return 1;
		}else{
			return num * calcularFatorial( num -1);
		}
	}
	
	public static int fibonacci(int num){
		int aux = 0,i = 1;
		if(aux  == num){
			return i;
		}
		
		return num;
	}
	
}
