package com.interfaces;

import com.classes.model.*;

public interface Subject {
    void adicionarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers(Assento assento);
}