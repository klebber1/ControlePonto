package model;

public class Secretaria extends Funcionario{

    private double valorHora;



    public Secretaria(int idFunc, String nome, String email, String documento, double valorHora) {
        super(idFunc, nome, email, documento);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


}
