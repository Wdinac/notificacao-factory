package br.fatec.factory;

import br.fatec.model.Email;
import br.fatec.model.Notificacao;

public class FabricaEmail extends FabricaNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new Email();
    }
}