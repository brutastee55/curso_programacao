package exerciciosChatGPT.exercicio1.expection;

public class EstoqueInsuficienteException extends RuntimeException {
    public EstoqueInsuficienteException(String msg){
        super(msg);
    }
}
