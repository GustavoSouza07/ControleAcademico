package com.classes.view;

import com.classes.model.*;
import com.interfaces.Observer;

public class PainelCentral implements Observer {
    @Override
    public void atualizar(Assento assento) {
        String cor;
        switch (assento.getStatus()) {
            case DISPONIVEL:
                cor = "Verde";
                break;
            case RESERVADO:
                cor = "Amarelo";
                break;
            case INDISPONIVEL:
                cor = "Vermelho";
                break;
            default:
                cor = "Desconhecido";
        }

        System.out.println("PainelCentral: Assento " + assento.getNumero() + " -> " + cor);
        System.out.flush();
    }

    
}

