package com.testes;

import com.classes.model.Assento;
import com.classes.model.StatusAssento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssentoTest {

    @Test
    void deveCriarAssentoComNumeroEStatus() {
        Assento assento = new Assento(1);
        assertEquals(1, assento.getNumero());
        assertEquals(StatusAssento.DISPONIVEL, assento.getStatus());
    }

    @Test
    void deveAlterarStatusDoAssento() {
        Assento assento = new Assento(2);
        assento.setStatus(StatusAssento.RESERVADO);
        assertEquals(StatusAssento.RESERVADO, assento.getStatus());

        assento.setStatus(StatusAssento.INDISPONIVEL);
        assertEquals(StatusAssento.INDISPONIVEL, assento.getStatus());
    }
}
