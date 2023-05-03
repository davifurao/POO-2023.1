package heranca;

import java.time.LocalDateTime;

public class PacienteFeminino extends Paciente {

	public PacienteFeminino(String nome, String cpf, String numeroConta, LocalDateTime data, float imc, float peso,
			float altura) {
		super(nome, cpf, numeroConta, data, imc, peso, altura);
		
	}

	
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

}
