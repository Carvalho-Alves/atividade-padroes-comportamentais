package br.edu.ifpb.ads.padroes.atv2;

public interface ItemTributavel {

    double getValor();

    void aceitar(ItemVisitor visitor);

}
