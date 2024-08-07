package net.pedro.estacionamento;

import net.pedro.estacionamento.model.Carro;

public class sistemaEstacionamento{
    public static void main(String[] args) {
        //criar dois objetos
        //Estacionar um e para o outro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //Atribuindo valores ao atributos
        carro1.marca = "Fiat";
        carro1.modelo = "Pulse";
        carro1.placa = "ABC1234";
        carro1.ano = 2019;

    }
}
