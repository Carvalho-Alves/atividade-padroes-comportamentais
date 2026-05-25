package br.edu.ifpb.ads.padroes.atv1;

public class InteressePorArtista implements InteresseDisco {

    private String artista;

    public InteressePorArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getArtista().toLowerCase().contains(artista.toLowerCase());
    }

}
