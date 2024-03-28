package com.jvneves.estudojava.polimorfismo.test;

import com.jvneves.estudojava.polimorfismo.repositorio.Repositorio;
import com.jvneves.estudojava.polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
