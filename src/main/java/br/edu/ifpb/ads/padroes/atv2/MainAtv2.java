package br.edu.ifpb.ads.padroes.atv2;

import java.util.ArrayList;
import java.util.List;

public class MainAtv2 {

    public static void main(String[] args) {
        List<ItemTributavel> itens = new ArrayList<>();

        itens.add(new ProdutoFisico("Notebook", 3000.00));
        itens.add(new Servico("Consultoria", 1000.00));
        itens.add(new ProdutoFisico("Mouse", 150.00));
        itens.add(new Servico("Manutencao", 500.00));

        System.out.println("--- Impressao dos valores ---");
        ImpressaoValoresVisitor impressao = new ImpressaoValoresVisitor();
        for (ItemTributavel item : itens) {
            item.aceitar(impressao);
        }

        System.out.println("\n--- Relatorio de impostos ---");
        RelatorioImpostosVisitor relatorio = new RelatorioImpostosVisitor();
        for (ItemTributavel item : itens) {
            item.aceitar(relatorio);
        }
        System.out.println("Total de impostos: R$ " + relatorio.getTotalImpostos());
    }

}
