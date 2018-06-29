package Exercicio02;

import java.util.Scanner;

public class Professor {
	
	private String nome;
	private String departamento;
	private String email;
	
	Scanner teclado =new Scanner(System.in);
	
	public Professor(){
		cadastrarProfessor();
	}
	
	public void cadastrarProfessor(){
		System.out.println("Informe o nome do Professor!!");
		this.nome = teclado.nextLine();
		System.out.println("Informe o nome do Departamento!!");
		this.departamento= teclado.nextLine();
		System.out.println("Informe o email do Professor!!");
		this.email = teclado.nextLine();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
