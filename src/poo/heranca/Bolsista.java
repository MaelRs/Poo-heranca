package poo.heranca;

public class Bolsista extends Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando a bolsa de "+this.nome);
	}
	@Override
	public void pagarMensal() {
		System.out.println(this.nome+" é bolsista, portanto sua mensalidade é facilitada e diferenciada.");
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	@Override
	public String toString() {
		return super.toString()+ "Bolsista [bolsa=" + bolsa + "]";
	}
	
	
}
