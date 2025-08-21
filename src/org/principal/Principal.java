package org.principal;

import org.model.Marca;

public class Principal {

    public static void main(String[] args) {

        Marca marca = new Marca();
        marca.id = 1;
        marca.nome = "Ford";
        marca.destricao = "KA";
        System.out.println(marca.id);
        System.out.println(marca.nome);
        System.out.println(marca.destricao);
    }
}
