package br.edu.ifpb.ads.padroes.atv1;

public class NotificacaoSMS implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }

}
