package br.fatec.model;

public class Email implements Notificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}