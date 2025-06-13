package com.classes.controller;

import com.classes.model.*;

public class VendaPassagemController {
    private final Onibus onibus;

    public VendaPassagemController(Onibus onibus) {
        this.onibus = onibus;
    }

    public void reservar(int numero) {
        onibus.reservarAssento(numero);
    }

    public void vender(int numero) {
        onibus.venderAssento(numero);
    }
}