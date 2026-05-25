package br.edu.ifpb.ads.padroes.atv1;

public class InteressePorGenero implements InteresseDisco {

    private String genero;

    public InteressePorGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean corresponde(Disco disco) {
        return disco.getGenero().toLowerCase().contains(genero.toLowerCase());
    }

}
