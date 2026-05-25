package br.edu.ifpb.ads.padroes.atv1;

public class Main {

    public static void main(String[] args) {
        RepositorioDiscos repositorio = new RepositorioDiscos();

        repositorio.addInteressado(new ClienteInteressado("Ana",
                new InteressePorTitulo("Thriller"), new NotificacaoEmail()));

        repositorio.addInteressado(new ClienteInteressado("Bruno",
                new InteressePorTitulo("Thriller"), new NotificacaoSMS()));

        repositorio.addInteressado(new ClienteInteressado("Carlos",
                new InteressePorArtista("Michael Jackson"), new NotificacaoPush()));

        repositorio.addInteressado(new ClienteInteressado("Diana",
                new InteressePorGenero("Rock"), new NotificacaoEmail()));

        System.out.println("--- Adicionando Thriller ---");
        repositorio.addDisco(new Disco("Michael Jackson", "Thriller", "Pop", 1982));

        System.out.println("\n--- Adicionando Bohemian Rhapsody ---");
        repositorio.addDisco(new Disco("Queen", "Bohemian Rhapsody", "Rock", 1975));
    }

}
