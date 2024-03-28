package com.jvneves.estudojava.polimorfismo.test;

import com.jvneves.estudojava.polimorfismo.dominio.Computador;
import com.jvneves.estudojava.polimorfismo.dominio.Televisao;
import com.jvneves.estudojava.polimorfismo.dominio.Tomate;
import com.jvneves.estudojava.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
