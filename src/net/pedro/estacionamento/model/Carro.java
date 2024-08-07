package net.pedro.estacionamento.model;

public class Carro {
    public String marca;
    public String modelo;
    public String placa;
    public int ano;

    public void estacionar(){
        System.out.println("Carro Estacionado: " + modelo);
    }

    public void retirar(){
        System.out.println("Carro retirado: " + modelo);
    }

    public void imprimir(){
        System.out.println("ano: " + ano);
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("placa: " + placa);
    }
}
