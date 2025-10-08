package exercicios.exercicioSecao9.entities;

public class Conta {

    private int accountNumber;
    private String name;
    private double value;

    public Conta(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        addValue(initialDeposit);
    }

    public Conta(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void addValue(double value) {
        this.value += value;
    }

    public void removeValue(double value) {
        if (value <= getValue()) {
            this.value -= value + 5;
        } else {
            throw new Error("Não possui saldo");
        }
    }

    public String toString() {
        return "Account "
                + getAccountNumber()
                + ", Holder: "
                + getName()
                + ", Balance: $ "
                + String.format("%.2f", getValue())
                ;
    }
}
