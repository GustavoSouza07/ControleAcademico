package com.classes.sanduicheConcreto;

import com.classes.factoryMethod.SanduicheFactoryMethod;
import com.classes.ingredientes.OvoGranja;
import com.classes.ingredientes.PaoBola;
import com.classes.ingredientes.PresuntoFrango;
import com.classes.ingredientes.QueijoCheddar;
import com.classes.ingredientes.Tomate;
import com.classes.produtoFinal.Sanduiche;

public class SanduicheBolaFactory extends SanduicheFactoryMethod {

    public SanduicheBolaFactory() {
        this.pao = new PaoBola();
        this.queijo = new QueijoCheddar();
        this.presunto = new PresuntoFrango();
        this.ovo = new OvoGranja();
        this.tomate = new Tomate();
    }

    @Override
    public Sanduiche criarSanduiche() {
        validarIngredientes();
        return new Sanduiche(pao, queijo, presunto, ovo, tomate);
    }
}

