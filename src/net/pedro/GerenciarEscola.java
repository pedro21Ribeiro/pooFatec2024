package net.pedro;

import net.pedro.modelos.Aluno;

public class GerenciarEscola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.ra = 111;
        aluno1.nome = "Maria";
        
        //Imprimir os dados do aluno 1
        aluno1.imprimir();   

        Aluno aluno2 = new Aluno();
        aluno2.ra = 222;
        aluno2.nome = "Joao";

        Aluno.unidade = "Fatec Itapira";

        aluno2.imprimir();
    }       
}
