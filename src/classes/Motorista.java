package classes;
public class Motorista{

    private String nome;
    private int matricula;
    private Carro veiculoAtual;
    public Motorista(Carro carr) {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }
    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }
@Override
public String toString(){
    return "qualquer coisa";
}
public void acelerar(int i) {
}
}