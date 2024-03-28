package com.jvneves.estudojava.polimorfismo.servico;

import com.jvneves.estudojava.polimorfismo.dominio.Computador;
import com.jvneves.estudojava.polimorfismo.dominio.Produto;
import com.jvneves.estudojava.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
