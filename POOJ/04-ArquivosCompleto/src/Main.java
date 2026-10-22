void main(){
    Arquivo arquivoMusical;
    Album album;
    Faixa faixa;
    Duration duracao;
    List<String> artistas, compositores;

    artistas = new ArrayList<>();
    artistas.add("Anitta");

    compositores = new ArrayList<>();
    compositores.add("Anitta");

    album = new Album("Equilibrium", artistas, 2026);

    duracao = Duration.ofMinutes(2).plusSeconds(51);
    faixa = new Faixa("Desgraça", 1, duracao, GeneroMusical.POP, artistas, compositores);

    album.adicionarFaixa(faixa);

    duracao = Duration.ofMinutes(3).plusSeconds(7);
    artistas.add("Marina Sena");
    faixa = new Faixa("Mandinga", 2, duracao, GeneroMusical.POP, artistas, compositores);

    album.adicionarFaixa(faixa);

    arquivoMusical = new Arquivo("Equilibrium.txt");
    arquivoMusical.limpar();
    arquivoMusical.adicionarln(album.toStringDetalhado());

    //-----------------------------------------------------------------
    artistas = new ArrayList<>();
    compositores = new ArrayList<>();
    /*
    album = new Album(NOME DO ALBUM, artistas, ANO);
    */

    arquivoMusical = new Arquivo("Outro Álbum.txt");
    arquivoMusical.limpar();
    arquivoMusical.adicionarln(album.toStringDetalhado());


}