package br.com.empregofaculdade;

public class SalarioDaFaculdade {

		private String nome;
		private double salario;
		private int horasAula;
		
		SalarioDaFaculdade(String nome,double salario,int horasAula){
			this.nome = nome;
			this.salario = salario;
			this.horasAula = horasAula;
		}
		

		double getGastos(){
		
			return this.salario + 40*horasAula;
		}
		String getInfo(){
			
		return "nome:" + this.nome + "com salário" + this.getGastos();
		
		}
		
		
		
		
		
}
