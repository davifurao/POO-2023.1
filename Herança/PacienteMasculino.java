package heranca;

import java.time.LocalDateTime;

public class PacienteMasculino extends Paciente {

	public PacienteMasculino(String nome, String cpf, String numeroConta, LocalDateTime data, float imc, float peso,
			float altura) {
		super(nome, cpf, numeroConta, data, imc, peso, altura);
		
	}

	@Override
	public float calcularMetabolismoBasal() {
		if(super.getIdade()>0 && super.getIdade() <=3) {
			return (float) ((60.9*super.getPeso())-54);
		}
		if(super.getIdade()>3 && super.getIdade() <=10) {
			return (float)(22.7*super.getPeso()+495);
		}
		if(super.getIdade()>10 && super.getIdade()<=18) {
			return (float)(17.5*super.getPeso()+651);
		}
		if(super.getIdade()>18 && super.getIdade()<=30) {
			return (float)(15.3*super.getPeso()+679);
		}
		if(super.getIdade()>30 && super.getIdade()<=60) {
			return (float)(11.6*super.getPeso()+879);
		}
		else {
			return (float)(19.5*super.getPeso()+487);
		}
	}

	
}
