package classes;
public class Carro{
private String placa;
private int numChassi;
private int velocidadeAtual;
public Carro(String string, int i) {
}

public String getPlaca() {
    return placa;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public int getNumChassi() {
    return numChassi;
}

public void setNumChassi(int numChassi) {
    this.numChassi = numChassi;
}

public int getVelocidadeAtual() {
    return velocidadeAtual;
}

public void setVelocidadeAtual(int velocidadeAtual) {
    this.velocidadeAtual = velocidadeAtual;
}

void acelerar(){
 velocidadeAtual++;
 }

void acelerar(int limite){
for (int i = 0; i < limite; i++){
    this.acelerar();
}

}

}