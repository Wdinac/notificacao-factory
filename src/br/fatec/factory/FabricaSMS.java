package br.fatec.factory;

import br.fatec.model.Notificacao;
import br.fatec.model.SMS;

public class FabricaSMS extends FabricaNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new SMS();
    }
}