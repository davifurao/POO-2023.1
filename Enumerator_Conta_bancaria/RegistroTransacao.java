import java.time.LocalDateTime;//importando classe para salvar o horário da transação

public class RegistroTransacao {
    private Interger id;
    private LocalDateTime dataTransacao;
    private double valor;
    private TipoTransacao tipo;//importando o enumerator(do tipo TipoTransacao) da classe Tipo transação

    private static int CONTADOR=0;

    public RegistroTransacao(LocalDateTime data,double valor, TipoTransacao tipo){//Construtor
        CONTADOR++;
        this.id = CONTADOR;//O id é o contador que sempre irá incrementar a cada novo objeto
        this.dataTransacao=data;
        this.tipo=tipo;
        if(tipo.getValor()==1 || tipo.getValor()==3){//se o tipo da transação for saque ou transferencia debitada
            this.valor = (valor*-1)//Caso seja um dos tipos acima, então o registro dessa transação será negativa
        }else {
            this.valor = valor;//Caso contrário o valor permanecerá positivo no extrato
        }

    }
//====================================Getters e Setters==================================================================
    public Interger getId(){
        return id;
    }

    public void setId(Interger Id){
        this.id=Id;
    }

    public LocalDateTime getDataTransacao(){
        return dataTransacao;
    }
    
    public void setDataTransacao(LocalDateTime dataTransacao){
        this.dataTransacao=dataTransacao;
    }

    public void getValor(){
        return valor;
    }
    public double setValor(double valor){
        this.valor=valor;
    }
    public TipoTransacao getTipotransacao(){
        return tipo;
    }
    public void setTipoTransacao(TipoTransacao tipoT){
        this.tipo=tipoT;
    }

    public int getCONTADOR(){
        return CONTADOR;
    }
    public void setCONTADOR(int CONTADORs){
        CONTADOR=CONTADORs;
    }


//ToString, equals, hashcode=====================================================================

public String toString(){
    return "RegistroTransacao [id="+id+", dataTransacao="+dataTransacao+", valor="+valor+", tipo="+tipo+"]";
}


public int hashCode(){
        return Objects.hash(id);
    }

public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        RegistroTransacao other = (RegistroTransacao) obj;
        return Objects.equals(id,other.id);
    }
}
