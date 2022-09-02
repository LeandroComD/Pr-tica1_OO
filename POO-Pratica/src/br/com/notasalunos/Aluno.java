package br.com.notasalunos;

public class Aluno {
	
	private String nome;
	private String curso;
	private int matricula, periodo;
	private float notaAV1, notaAV2, notaAE;
	

	public Aluno(String nome, String curso, int matricula, int periodo, float notaAV1, float notaAV2, float notaAE) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.periodo = periodo;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
	}
	
	public void alteraNotaAV1(float nota) {
		this.notaAV1 = nota;
	}
	public void alteraNotaAV2(float nota) {
		this.notaAV2 = nota;
	}
	public void alteraNotaAE(float nota) {
		this.notaAE = nota;
	}
	
	public String avaliarAluno() {
		
		if((this.notaAV1+this.notaAV2)>=60)
			
			return "Aprovado";
		
		else 
			return "Recuperacao";
	}
	
	public String avaliarRecuperacao() {
		
		if((this.notaAV1+this.notaAV2+this.notaAE)/2>=60)
			return "Aprovado";
		else
			return "Reprovado";
					
	}
	
	
}
