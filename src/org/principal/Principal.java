package org.principal;

import org.model.Marca;
import org.model.Modelo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Modelo mod1 = new Modelo(1, "Fod RANGER", new Date(), 10);
        Modelo mod2 = new Modelo(2, "Focus", new Date(), 5);
        List<Modelo> modelos = new ArrayList<>();
        modelos.add(mod1);
        modelos.add(mod2);

        mod1.setId(3);
        mod1.setNome("Onix");
        mod1.setQtModelos(45);
        mod1.setAnoModelo(new Date());

        Marca marca1 = new Marca(1,"FORD", modelos);
        System.out.println(mod1.toString());
        System.out.println(mod2.toString());
        System.out.println(marca1.toString());
        System.out.println(mod1.getId());
        System.out.println(mod1.getNome());
        System.out.println(mod1.getQtModelos());
        System.out.println(mod1.getAnoModelo());
    }
}
