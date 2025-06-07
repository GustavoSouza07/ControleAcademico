package com.classes.sanduicheConcreto;

import com.classes.factoryMethod.SanduicheFactoryMethod;
import com.classes.ingredientes.OvoCapoeira;
import com.classes.ingredientes.PaoIntegral;
import com.classes.ingredientes.PresuntoFrango;
import com.classes.ingredientes.QueijoMussarela;
import com.classes.ingredientes.Tomate;
import com.classes.produtoFinal.Sanduiche;

public class SanduicheIntegralFactory extends SanduicheFactoryMethod {

    public SanduicheIntegralFactory() {
        this.pao = new PaoIntegral();
        this.queijo = new QueijoMussarela();
        this.presunto = new PresuntoFrango();
        this.ovo = new OvoCapoeira();
        this.tomate = new Tomate();
    }

    @Override
    public Sanduiche criarSanduiche() {
        validarIngredientes();
        return new Sanduiche(pao, queijo, presunto, ovo, tomate);
    }
}
