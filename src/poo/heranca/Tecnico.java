package poo.heranca;

public class Tecnico extends Aluno {
	private int rgProfissional;
	
	public void praticando() {
		System.out.println("Tecnico Praticando");
	}

	public int getRgProfissional() {
		return rgProfissional;
	}

	public void setRgProfissional(int rgProfissional) {
		this.rgProfissional = rgProfissional;
	}

	@Override
	public String toString() {
		return super.toString()+"Tecnico [rgProfissional=" + rgProfissional + "]";
	}
	
	
	

}
