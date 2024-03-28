package com.jvneves.estudojava.polimorfismo.servico;

import com.jvneves.estudojava.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um BD");
    }
}
