package com.testes;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.classes.ingredientes.Tomate;
import com.classes.produtoFinal.Sanduiche;
import com.classes.sanduicheConcreto.SanduicheBolaFactory;
import com.classes.sanduicheConcreto.SanduicheFrancesFactory;
import com.classes.sanduicheConcreto.SanduicheIntegralFactory;

public class SanduicheFactoryTest {

    @Test
    public void testSanduicheBolaCriadoComSucesso() {
        SanduicheBolaFactory factory = new SanduicheBolaFactory();
        Sanduiche sanduiche = factory.criarSanduiche();
        assertNotNull(sanduiche);
    }

    @Test
    public void testSanduicheFrancesCriadoComSucesso() {
        SanduicheFrancesFactory factory = new SanduicheFrancesFactory();
        Sanduiche sanduiche = factory.criarSanduiche();
        assertNotNull(sanduiche);
    }

    @Test
    public void testSanduicheIntegralCriadoComSucesso() {
        SanduicheIntegralFactory factory = new SanduicheIntegralFactory();
        Sanduiche sanduiche = factory.criarSanduiche();
        assertNotNull(sanduiche);
    }

    @Test
    public void testExcecaoIngredienteNuloNaBolaFactory() {
        SanduicheBolaFactory factory = new SanduicheBolaFactory();
        factory.setTomate(null); // ingrediente ausente

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, factory::criarSanduiche);
        assertEquals("Ingrediente 'tomate' está ausente.", exception.getMessage());
    }

    @Test
    public void testExcecaoIngredienteNuloNaIntegralFactory() {
        SanduicheIntegralFactory factory = new SanduicheIntegralFactory();
        factory.setPresunto(null); // ingrediente ausente

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, factory::criarSanduiche);
        assertEquals("Ingrediente 'presunto' está ausente.", exception.getMessage());
    }

    @Test
    public void testPersonalizacaoDeIngrediente() {
        SanduicheFrancesFactory factory = new SanduicheFrancesFactory();
        Tomate novoTomate = new Tomate();
        factory.setTomate(novoTomate);
        assertEquals(novoTomate, factory.getTomate());
    }

    @Test
public void testExibirIngredientesMostraTodosOsItens() {
    SanduicheFrancesFactory factory = new SanduicheFrancesFactory();
    Sanduiche sanduiche = factory.criarSanduiche();

    ByteArrayOutputStream saida = new ByteArrayOutputStream();
    PrintStream consoleOriginal = System.out;
    System.setOut(new PrintStream(saida));

        sanduiche.exibirIngredientes();

    System.setOut(consoleOriginal);

    String resultado = saida.toString();
    assertTrue(resultado.contains("Sanduíche a servir:"));
    assertTrue(resultado.contains("- "));
    assertTrue(resultado.contains("Pão"));     
    assertTrue(resultado.contains("Queijo"));  
    assertTrue(resultado.contains("Presunto"));
    assertTrue(resultado.contains("Ovo"));
    assertTrue(resultado.contains("Tomate"));
}
}
