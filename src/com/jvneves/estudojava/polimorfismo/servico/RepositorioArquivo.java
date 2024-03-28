package com.jvneves.estudojava.polimorfismo.servico;

import com.jvneves.estudojava.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
