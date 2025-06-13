package com.classes.model;

import com.interfaces.*;
import com.interfaces.Observer;

import java.util.*;

public class Onibus implements Subject {
    private List<Assento> assentos = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public Onibus(int totalAssentos) {
        for (int i = 1; i <= totalAssentos; i++) {
            assentos.add(new Assento(i));
        }
    }

    public void reservarAssento(int numero) {
        Assento a = assentos.get(numero - 1);
        a.setStatus(StatusAssento.RESERVADO);
        notificarObservers(a);
    }

    public void venderAssento(int numero) {
        Assento a = assentos.get(numero - 1);
        a.setStatus(StatusAssento.INDISPONIVEL);
        notificarObservers(a);
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    public void notificarObservers(Assento assento) {
        for (Observer o : observers) {
            o.atualizar(assento);
        }
    }
}