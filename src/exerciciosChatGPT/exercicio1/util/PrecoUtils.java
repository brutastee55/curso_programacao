package exerciciosChatGPT.exercicio1.util;

import exerciciosChatGPT.exercicio1.model.Desconto;

public final class PrecoUtils {

    private  PrecoUtils(){

    }

    public static double arredondarDuasCasas(double v){
        return Math.round(v* 100.0) / 100.0;
    }

    public static double aplicarDesconto(double valor, Desconto d){
        double valorComDesconto = d.aplicar(valor);
        return arredondarDuasCasas(valorComDesconto);
    }
}
