package com.java;

import com.classes.controller.VendaPassagemController;
import com.classes.model.Onibus;
import com.classes.view.*;;

public class Main {
    public static void main(String[] args) {
        // Inicializa um ônibus com 10 assentos
        Onibus onibus = new Onibus(10);

        // Cria visualizações
        PainelCentral painel = new PainelCentral();
        Quiosque quiosque1 = new Quiosque("Quiosque 1");
        Quiosque quiosque2 = new Quiosque("Quiosque 2");
        Quiosque quiosque3 = new Quiosque("Quiosque 3");

        // Adiciona os observadores (visualizações) ao modelo
        onibus.adicionarObserver(painel);

        onibus.adicionarObserver(quiosque1);
        onibus.adicionarObserver(quiosque2);
        onibus.adicionarObserver(quiosque3);

        // Controller que executa ações
        VendaPassagemController controller = new VendaPassagemController(onibus);

        // Realiza algumas operações no modelo (ações do cliente no guichê)
        controller.reservar(3); // Assento 3 → Reservado (Amarelo)
        controller.vender(5); // Assento 5 → Indisponível (Vermelho)
        controller.reservar(1); // Assento 1 → Reservado
        controller.vender(3); // Assento 3 agora vendido → Indisponível

        // Exibe o status final de todos os assentos
        System.out.println("\nSTATUS FINAL DOS ASSENTOS:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Assento " + i + ": " + onibus.getAssentos().get(i - 1).getStatus());
        }

    }
}
