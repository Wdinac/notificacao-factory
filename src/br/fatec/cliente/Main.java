package br.fatec.cliente;

import br.fatec.factory.FabricaEmail;
import br.fatec.factory.FabricaNotificacao;
import br.fatec.factory.FabricaPush;
import br.fatec.factory.FabricaSMS;
import br.fatec.model.Notificacao;

public class Main {

    public static void main(String[] args) {

        FabricaNotificacao fabrica;

        String tipo = "push";

        if (tipo.equalsIgnoreCase("email")) {
            fabrica = new FabricaEmail();
        } else if (tipo.equalsIgnoreCase("sms")) {
            fabrica = new FabricaSMS();
        } else {
            fabrica = new FabricaPush();
        }

        Notificacao notificacao = fabrica.criarNotificacao();
        notificacao.enviarMensagem("Olá, você tem uma nova mensagem!");
    }
}