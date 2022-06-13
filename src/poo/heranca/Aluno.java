package poo.heranca;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void pagarMensal() {
		System.out.println("Pagando Mensalidade do aluno "+this.nome);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString()+" Aluno [matricula=" + matricula + ", curso=" + curso + "]";
	}
	
	
	
	
}
