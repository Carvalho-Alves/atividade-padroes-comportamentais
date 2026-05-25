package br.edu.ifpb.ads.padroes.atv1;

public class InteressePorTitulo implements InteresseDisco {

    private String titulo;

    public InteressePorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getTitulo().toLowerCase().contains(titulo.toLowerCase());
    }

}
