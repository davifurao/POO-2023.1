import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Paciente {
	private String CPF;
	protected LocalDateTime data;
	private String nome;
	private float altura;
	private float peso;
	private int idade;
	private float imc;
	
	public Paciente(String CPF, String nome, float altura, float peso,int idade, LocalDateTime data){
		this.CPF=CPF;
		this.nome=nome;
		this.altura=altura;
		this.peso=peso;
		this.idade=idade;
		this.imc=calcularIMC();
		this.setData(LocalDateTime.now());
	}
	
	public float calcularIMC() {
		return peso/(altura*altura);
	}
	
	public abstract float calcularMetabolismoBasal();

	@Override
	public int hashCode() {
		return Objects.hash(CPF);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(CPF, other.CPF);
	}

	@Override
	public abstract String toString();

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	} 
	
	
	
	
}
