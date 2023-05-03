package heranca;


import java.time.LocalDateTime;
import java.util.Objects; 

public abstract class Paciente {

	private String nome;
	private String cpf;
	private LocalDateTime data;
	private float imc;
	private float peso;
	private float altura;
	private int idade;
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Paciente(String nome,String cpf,String numeroConta, LocalDateTime data,float imc,float peso,float altura) {
		this.nome=nome;
		this.cpf=cpf;
		this.data=LocalDateTime.now();
		this.altura=altura;
		this.peso=peso;
		this.imc=calcularIMC();
	}
	
	public float calcularIMC() {
		return this.peso/(this.altura*this.altura);
	}
	
	public abstract float calcularMetabolismoBasal();
	 
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
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
		return Objects.equals(cpf, other.cpf);
	}

	
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", cpf=" + cpf + ", data=" + data + ", imc=" + imc + ", peso=" + peso
				+ ", altura=" + altura + ", idade=" + idade + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return idade;
	}

	
	
}
