package com.java;

import com.classes.factoryMethod.SanduicheFactoryMethod;
import com.classes.produtoFinal.Sanduiche;
import com.classes.sanduicheConcreto.*;
import com.classes.ingredientes.*;
import com.interfaces.*;


public class Main {
    public static void main(String[] args) {
        SanduicheFactoryMethod factory1 = new SanduicheIntegralFactory();
        SanduicheFactoryMethod factory2 = new SanduicheFrancesFactory();
        SanduicheBolaFactory factory3 = new SanduicheBolaFactory(); 

        // Personalizando ingredientes
        InterfaceQueijo queijo = new QueijoMussarela();
        factory3.setQueijo(queijo);

        // Exemplo de personalização de outros ingredientes 
        // factory3.setPao(new PaoFrances());
        // factory3.setPresunto(new PresuntoPeru());
        // factory3.setOvo(new OvoCaipira());
        // factory3.setTomate(new Tomate());

        Sanduiche s1 = factory1.criarSanduiche();
        Sanduiche s2 = factory2.criarSanduiche();
        Sanduiche s3 = factory3.criarSanduiche(); 

        s1.exibirIngredientes();
        s2.exibirIngredientes();
        s3.exibirIngredientes();
    }
}

