package br.com.notasalunos;

public class NotasAlunos {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ana","ADS", 1213131, 3, 30, 20, 0);
		
		System.out.println(aluno1.avaliarAluno());
		System.out.println(aluno1.avaliarRecuperacao());
		aluno1.alteraNotaAE(80);
		System.out.println("Alterar nota da Prova Especial");
		System.out.println(aluno1.avaliarRecuperacao());

	}

}
