package com.classes.sanduicheConcreto;

import com.classes.factoryMethod.SanduicheFactoryMethod;
import com.classes.ingredientes.OvoGranja;
import com.classes.ingredientes.PaoFrances;
import com.classes.ingredientes.PresuntoPeru;
import com.classes.ingredientes.QueijoMussarela;
import com.classes.ingredientes.Tomate;
import com.classes.produtoFinal.Sanduiche;

public class SanduicheFrancesFactory extends SanduicheFactoryMethod {

    public SanduicheFrancesFactory() {
        this.pao = new PaoFrances();
        this.queijo = new QueijoMussarela();
        this.presunto = new PresuntoPeru();
        this.ovo = new OvoGranja();
        this.tomate = new Tomate();
    }

    @Override
    public Sanduiche criarSanduiche() {
        validarIngredientes();
        return new Sanduiche(pao, queijo, presunto, ovo, tomate);
    }
}
