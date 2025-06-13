package com.testes;

import com.classes.model.Onibus;
import com.classes.model.StatusAssento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnibusTest {

    private Onibus onibus;

    @BeforeEach
    void setup() {
        onibus = new Onibus(5);
    }

    @Test
    void deveCriarAssentosComStatusDisponivel() {
        assertEquals(5, onibus.getAssentos().size());
        onibus.getAssentos().forEach(a -> assertEquals(StatusAssento.DISPONIVEL, a.getStatus()));
    }

    @Test
    void deveReservarAssentoValido() {
        onibus.reservarAssento(2);
        assertEquals(StatusAssento.RESERVADO, onibus.getAssentos().get(1).getStatus());
    }

    @Test
    void deveVenderAssentoValido() {
        onibus.venderAssento(3);
        assertEquals(StatusAssento.INDISPONIVEL, onibus.getAssentos().get(2).getStatus());
    }

    @Test
    void deveLancarExcecaoParaAssentoInvalido() {
        assertThrows(RuntimeException.class, () -> onibus.reservarAssento(0));
        assertThrows(RuntimeException.class, () -> onibus.venderAssento(6));
    }
}
