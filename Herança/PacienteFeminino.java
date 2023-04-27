import java.time.LocalDateTime;

public class PacienteFeminino extends Paciente {

	public PacienteFeminino(String CPF, String nome, float altura, float peso, int idade, LocalDateTime data) {
		super(CPF, nome, altura, peso, idade, data);
	}

	//método específico dessa classe
	public float calcularMetabolismoBasal() {
		if(super.getIdade()>0 && super.getIdade() <=3) {
			return (61*super.getPeso())-51;
		}
		if(super.getIdade()>3 && super.getIdade() <=10) {
			return (float) ((22.5*super.getPeso())+499);
		}
		if(super.getIdade()>10 && super.getIdade()<=18) {
			return (float)(12.2*super.getPeso())+746;
		}
		if(super.getIdade()>18 && super.getIdade()<=30) {
			return (float)(-14.7*super.getPeso())+496;
		}
		if(super.getIdade()>30 && super.getIdade()<=60) {
			return (float)(8.7*super.getPeso())+829;
		}
		else {
			return (float)(10.5*super.getPeso())+596;
		}
		
	}

	
	public String toString() {
		return "[ CPF: "+super.getCPF()+", nome: "+super.getNome()+", altura: "+super.getAltura()+", peso: "+super.getIdade()+",data: "+super.data+"]";
	}
	
	//Obs: O toString está sendo reescrito novamente, pois o método toString na classe pai está com o método abstract e 
	//o método toString deve ser reescrito, pois, no constrtor, pode aparecer um atributo diferente.
	
	
}
