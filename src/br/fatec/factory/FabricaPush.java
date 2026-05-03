package br.fatec.factory;

import br.fatec.model.Notificacao;
import br.fatec.model.PushNotification;

public class FabricaPush extends FabricaNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new PushNotification();
    }
}