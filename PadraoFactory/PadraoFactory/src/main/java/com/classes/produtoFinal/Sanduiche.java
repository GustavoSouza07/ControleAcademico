package com.classes.produtoFinal;

import com.classes.ingredientes.Tomate;
import com.interfaces.InterfaceOvo;
import com.interfaces.InterfacePao;
import com.interfaces.InterfacePresunto;
import com.interfaces.InterfaceQueijo;

public class Sanduiche {
    InterfacePao pao;
    InterfaceQueijo queijo;
    InterfacePresunto presunto;
    InterfaceOvo ovo;
    Tomate tomate;

    public Sanduiche(InterfacePao pao, InterfaceQueijo queijo, InterfacePresunto presunto, InterfaceOvo ovo, Tomate tomate) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.ovo = ovo;
        this.tomate = tomate;
    }

    public void exibirIngredientes() {
        System.out.println("Sanduíche a servir:");
        System.out.println("- " + pao.tipo());
        System.out.println("- " + queijo.tipo());
        System.out.println("- " + presunto.tipo());
        System.out.println("- " + ovo.tipo());
        System.out.println("- " + tomate.tipo());
        System.out.println();
    }
}
