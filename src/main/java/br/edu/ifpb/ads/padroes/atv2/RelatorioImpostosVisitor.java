package br.edu.ifpb.ads.padroes.atv2;

public class RelatorioImpostosVisitor implements ItemVisitor {

    private static final double ALIQUOTA_PRODUTO = 0.10;
    private static final double ALIQUOTA_SERVICO = 0.15;

    private double totalImpostos = 0;

    @Override
    public void visitar(ProdutoFisico produtoFisico) {
        double imposto = produtoFisico.getValor() * ALIQUOTA_PRODUTO;
        totalImpostos += imposto;
        System.out.println("Produto: " + produtoFisico.getNome()
                + " | Valor: R$ " + produtoFisico.getValor()
                + " | Imposto (10%): R$ " + imposto);
    }

    @Override
    public void visitar(Servico servico) {
        double imposto = servico.getValor() * ALIQUOTA_SERVICO;
        totalImpostos += imposto;
        System.out.println("Servico: " + servico.getDescricao()
                + " | Valor: R$ " + servico.getValor()
                + " | Imposto (15%): R$ " + imposto);
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }

}
