package com.classes.factoryMethod;

import com.classes.produtoFinal.Sanduiche;
import com.interfaces.InterfaceOvo;
import com.interfaces.InterfacePresunto;
import com.interfaces.InterfaceQueijo;
import com.interfaces.InterfacePao;
import com.classes.ingredientes.Tomate;

public abstract class SanduicheFactoryMethod {

    protected InterfacePao pao;
    protected InterfaceQueijo queijo;
    protected InterfacePresunto presunto;
    protected InterfaceOvo ovo;
    protected Tomate tomate;

    public abstract Sanduiche criarSanduiche();

    protected void validarIngredientes() {
        if (pao == null)
            throw new IllegalArgumentException("Ingrediente 'pão' está ausente.");
        if (queijo == null)
            throw new IllegalArgumentException("Ingrediente 'queijo' está ausente.");
        if (presunto == null)
            throw new IllegalArgumentException("Ingrediente 'presunto' está ausente.");
        if (ovo == null)
            throw new IllegalArgumentException("Ingrediente 'ovo' está ausente.");
        if (tomate == null)
            throw new IllegalArgumentException("Ingrediente 'tomate' está ausente.");
    }

    // Getters e setters
    public InterfacePao getPao() {
        return pao;
    }

    public void setPao(InterfacePao pao) {
        this.pao = pao;
    }

    public InterfaceQueijo getQueijo() {
        return queijo;
    }

    public void setQueijo(InterfaceQueijo queijo) {
        this.queijo = queijo;
    }

    public InterfacePresunto getPresunto() {
        return presunto;
    }

    public void setPresunto(InterfacePresunto presunto) {
        this.presunto = presunto;
    }

    public InterfaceOvo getOvo() {
        return ovo;
    }

    public void setOvo(InterfaceOvo ovo) {
        this.ovo = ovo;
    }

    public Tomate getTomate() {
        return tomate;
    }

    public void setTomate(Tomate tomate) {
        this.tomate = tomate;
    }
}
