package br.edu.ifpb.ads.padroes.atv1;

public class ClienteInteressado implements Interessado {

    private String nome;
    private InteresseDisco interesse;
    private CanalNotificacao canal;

    public ClienteInteressado(String nome, InteresseDisco interesse, CanalNotificacao canal) {
        this.nome = nome;
        this.interesse = interesse;
        this.canal = canal;
    }

    @Override
    public boolean temInteresse(Disco disco) {
        return interesse.corresponde(disco);
    }

    @Override
    public void notificar(Disco disco) {
        String mensagem = "Novo disco adicionado: " + disco.getTitulo()
                + " (" + disco.getArtista() + ", " + disco.getGenero() + ")";
        canal.enviar(mensagem);
    }

    public String getNome() {
        return nome;
    }

}
