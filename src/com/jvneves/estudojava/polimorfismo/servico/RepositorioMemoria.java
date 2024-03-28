package com.jvneves.estudojava.polimorfismo.servico;

import com.jvneves.estudojava.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}