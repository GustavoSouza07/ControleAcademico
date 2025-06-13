package com.classes.view;

import com.classes.model.*;
import com.interfaces.Observer;

public class Quiosque implements Observer {
    private String nome;

    public Quiosque(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Assento assento) {
        System.out.println(nome + ": Assento " + assento.getNumero() + " agora está " + assento.getStatus());
        System.out.flush();
    }

}
