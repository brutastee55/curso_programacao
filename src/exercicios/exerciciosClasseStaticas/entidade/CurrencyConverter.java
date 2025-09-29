package exercicios.exerciciosClasseStaticas.entidade;

public class CurrencyConverter {

    public static double converterDolarReal(double dolarValue, double quantityDolarValue){
        return (dolarValue * quantityDolarValue) * (1 + 6.0 / 100);
    }
}
