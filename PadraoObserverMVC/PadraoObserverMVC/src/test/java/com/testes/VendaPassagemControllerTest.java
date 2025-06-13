package com.testes;

import com.classes.controller.VendaPassagemController;
import com.classes.model.Onibus;
import com.classes.model.StatusAssento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaPassagemControllerTest {

    private VendaPassagemController controller;
    private Onibus onibus;

    @BeforeEach
    void setup() {
        onibus = new Onibus(5);
        controller = new VendaPassagemController(onibus);
    }

    @Test
    void deveReservarAssentoViaController() {
        controller.reservar(4);
        assertEquals(StatusAssento.RESERVADO, onibus.getAssentos().get(3).getStatus());
    }

    @Test
    void deveVenderAssentoViaController() {
        controller.vender(1);
        assertEquals(StatusAssento.INDISPONIVEL, onibus.getAssentos().get(0).getStatus());
    }

    @Test
    void deveLancarErroEmReservaInvalida() {
        assertThrows(RuntimeException.class, () -> controller.reservar(99));
    }

    @Test
    void deveLancarErroEmVendaInvalida() {
        assertThrows(RuntimeException.class, () -> controller.vender(-5));
    }
}
