package poo.heranca;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public void receberAumento(float v) {
		this.setSalario(this.getSalario()+v);
		
		
	}

	public Professor(String especialidade) {
		super();
		this.especialidade = especialidade;
		this.salario = 7800.67f;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString()+ "Professor [especialidade=" + especialidade + ", salario= " + salario + "]";
	}
	
	
}
