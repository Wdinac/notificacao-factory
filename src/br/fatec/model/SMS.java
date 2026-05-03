package br.fatec.model;

public class SMS implements Notificacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}