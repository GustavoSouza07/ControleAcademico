package com.testes;

import com.classes.model.Assento;
import com.classes.view.*;
import com.classes.model.StatusAssento;
import org.junit.jupiter.api.Test;

public class ObserversTest {

    @Test
    public void testPainelCentralAtualizacao() {
        PainelCentral painel = new PainelCentral();
        Assento a = new Assento(1);
        a.setStatus(StatusAssento.RESERVADO);
        painel.atualizar(a);
    }

    @Test
    public void testQuiosqueAtualizacao() {
        Quiosque q = new Quiosque("Q1");
        Assento a = new Assento(2);
        a.setStatus(StatusAssento.INDISPONIVEL);
        q.atualizar(a);
    }
}
