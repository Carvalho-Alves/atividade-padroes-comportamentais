package br.edu.ifpb.ads.padroes.atv1;

import java.util.LinkedList;
import java.util.List;

public class RepositorioDiscos {

    private List<Disco> discos = new LinkedList<>();
    private List<Interessado> interessados = new LinkedList<>();

    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream().filter(d -> d.getTitulo().toLowerCase()
                .contains(titulo.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream().filter(d -> d.getArtista().toLowerCase()
                .contains(artista.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream().filter(d -> d.getGenero().toLowerCase()
                .contains(genero.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream().filter(d -> d.getAnoLancamento() == ano).toList();
    }

    public void addDisco(Disco disco) {
        discos.add(disco);
        notificarInteressados(disco);
    }

    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }

    public void addInteressado(Interessado interessado) {
        interessados.add(interessado);
    }

    public void removeInteressado(Interessado interessado) {
        interessados.remove(interessado);
    }

    private void notificarInteressados(Disco disco) {
        for (Interessado interessado : interessados) {
            if (interessado.temInteresse(disco)) {
                interessado.notificar(disco);
            }
        }
    }

}
