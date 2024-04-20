package model;

public class Gerente extends Funcionario{
    private String loguin;
    private String senha;



    public Gerente(int idFunc, String nome, String email, String documento, String loguin, String senha) {
        super(idFunc, nome, email, documento);
        this.loguin = loguin;
        this.senha = senha;
    }

    public String getLoguin() {
        return loguin;
    }

    public void setLoguin(String loguin) {
        this.loguin = loguin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
