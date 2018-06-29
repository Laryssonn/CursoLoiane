package Exercicio02;

import java.util.Scanner;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	Scanner teclado = new Scanner(System.in);
	
	
	public Curso() {
		cadastrarCurso();
	}
	
	public void cadastrarCurso(){
		System.out.println("Informe o nome do Curso!!");
		setNome(teclado.nextLine());
		System.out.println("Informe o Horário do Curso!!");
		this.horario = teclado.nextLine();
		
	}

	public void calcularMediaTurma(){
		double media = 0;
		
		for(Aluno alunos: alunos){
			media += alunos.getMediaAluno();
			System.out.println("__________________________________________");
			System.out.println("Nome do Aluno: "+alunos.getNome());
			System.out.println("Matricula do Aluno: "+alunos.getMatricula());
			System.out.println("Média do Aluno: "+alunos.getMediaAluno());
			verificarSituacaoAluno(alunos);
			System.out.println("__________________________________________");
			
		}
		
		media /= alunos.length;
		System.out.println("A media da Turma é: "+media);
	}
	public void verificarSituacaoAluno(Aluno aluno){
		if(aluno.getMediaAluno() >= 7){
			System.out.println("Situação: Aluno Aprovado");
		}else{
			System.out.println("Situação: Aluno Reprovado");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
}
