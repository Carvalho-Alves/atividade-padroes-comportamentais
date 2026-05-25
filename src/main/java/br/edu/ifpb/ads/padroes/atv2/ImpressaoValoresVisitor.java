package br.edu.ifpb.ads.padroes.atv2;

public class ImpressaoValoresVisitor implements ItemVisitor {

    @Override
    public void visitar(ProdutoFisico produtoFisico) {
        System.out.println("Produto: " + produtoFisico.getNome()
                + " | Valor: R$ " + produtoFisico.getValor());
    }

    @Override
    public void visitar(Servico servico) {
        System.out.println("Servico: " + servico.getDescricao()
                + " | Valor: R$ " + servico.getValor());
    }

}
