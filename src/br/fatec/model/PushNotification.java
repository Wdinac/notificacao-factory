package br.fatec.model;

public class PushNotification implements Notificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando PUSH: " + mensagem);
    }
}