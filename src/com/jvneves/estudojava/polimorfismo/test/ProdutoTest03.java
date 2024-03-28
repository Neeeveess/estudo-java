package com.jvneves.estudojava.polimorfismo.test;

import com.jvneves.estudojava.polimorfismo.dominio.Computador;
import com.jvneves.estudojava.polimorfismo.dominio.Produto;
import com.jvneves.estudojava.polimorfismo.dominio.Tomate;
import com.jvneves.estudojava.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);



        Tomate tomate = new Tomate("Americano", 30);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
