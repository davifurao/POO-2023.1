public enum TipoTransacao {//Enumerator: O enumerator é utilizado para criar uma estrutura
    //de dados. O que irá ser armazenado no BD é um número(constante). Esse armazenamento de tipo 
    //é mais recomendável do que armazenar uma string, que dá mais margem para erro na hora de relacionar
    //o código. Resumindo, é mais fifícil voc~e errar um número do que um varchar(caps lock, acento, etc).

    SAQUE(1),
    DEPOSITO(2),
    TRANSFERENCIA_DEBITADA(3),
    TRANSFERENCIA_CREDITADA(4),

//======================================================================================================================================================//
    private final int valor; //a variável valor está declarada como final pois, quando o objeto for declarado e a variável for 
    //atribuída, a mesma será uma constante.

    
//======================================================================================================================================================//
    private TipoTransacao(int valor) { //construtor do tipo com o parametro do valor em inteiro que vai ser associado ao respectivo tipo.
        this.valor = valor;
    }


    //*Retornar o valor do enumerator(variável declarada como final)*
//======================================================================================================================================================//
    public int getValor(){
        return valor;
    }


    //*Retornar o tipo do enumerator*
//======================================================================================================================================================//
    public static TipoTransacao getTipoTransacao(int valor){//Método que irá retornar o tipo da transacao de acordo
        //com o valor. Percebe-se que o tipo do valor que irá ser retornado é "TipoTransacao"
        for(TipoTransacao T:values()){//É instanciado um objeto temporário T.O values() é um método herdado da classe enumerator
            if(t.getvalor()== valor){//se o valor da função values(um dos "enum" declarados) é igual ao inteiro valor declarado no escopo do método.
                return T;
            }
            return null;//se o inteiro não for igual ao tipo dos enum(ou seja, se for inexistente)
        }
    }
}
