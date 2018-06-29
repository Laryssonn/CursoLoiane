package Exercicio02;

public class Principal {

	public static void main(String[] args) {
		Curso curso = new Curso();
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		Aluno[] alunos = new Aluno[5];
		
		alunos[0] =  aluno;
		alunos[1] =  aluno2;
		alunos[2] =  aluno3;
		alunos[3] =  aluno4;
		alunos[4] =  aluno5;
		
		curso.setProfessor(professor);
		curso.setAlunos(alunos);
		curso.calcularMediaTurma();
		

	}

}
