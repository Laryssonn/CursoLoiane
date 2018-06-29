package Exercicio02;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private String matricula;
	private double mediaAluno;
	private double[] notas = new double[4];
			
	Scanner teclado = new Scanner(System.in);
	
	public Aluno() {
		cadastrarAlunos();
		
	}
	
	public void cadastrarAlunos(){
		System.out.println("Informe o nome do Aluno");
		this.nome = teclado.nextLine();
		System.out.println("Informe a matricula do Aluno");
		this.matricula = teclado.nextLine();
		
		for(int x = 0; x < notas.length;x++){
			System.out.println("Informe a "+(x + 1)+"º nota do Aluno");
			this.notas[x] = teclado.nextDouble();
		}
		calcularMediaAluno();
		
	}
	public void calcularMediaAluno(){
		int cont = 0;
		for(double nota:notas){
			mediaAluno +=nota;
			cont++;
		}
		
		
		 mediaAluno = mediaAluno / cont;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double getMediaAluno() {
		return mediaAluno;
	}

}
