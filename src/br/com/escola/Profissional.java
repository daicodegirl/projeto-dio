package br.com.escola;

public class Profissional extends Pessoa {
    private double salario;
    private String cargo;
    private String materia;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
