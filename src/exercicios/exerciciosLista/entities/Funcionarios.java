package exercicios.exerciciosLista.entities;

public class Funcionarios {

    private int id;
    private String name;
    private double salary;

    public Funcionarios(int id, String name, double salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }

    public void aumentarSalario(int id, double aumento) {
        setSalary(getSalary() * (1 + aumento / 100));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return getId() + ", "
                + getName() + ", "
                + String.format("%.2f", getSalary())
                ;

    }

}
