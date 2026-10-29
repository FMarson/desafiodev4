void main(){
    /*
    Arquivo arquivoMusical, arquivoDadosAlbum;
    Album album;
    Faixa faixa;
    Duration duracao;
    List<String> artistas, compositores;

    List<String> linhasArquivo;

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

    linhasArquivo = new ArrayList<>();

    arquivoMusical = new Arquivo("equilibrium.txt");
    arquivoDadosAlbum = new Arquivo("equilibrium.dat");

    //    album = Album.fromString(linhasArquivo);

    arquivoMusical.adicionarln(album.toStringDetalhado());
    arquivoDadosAlbum.adicionarln(album.toString());
     */

    menuPrincipal();
}
void menuCriarAlbum(){
    IO.println("Você selecionou a criação de álbuns!");
}

void menuPrincipal(){
    String opcao;

    do {
        IO.println("Menu principal");
        IO.println("1) Criar álbum");
        IO.println("2) Carregar álbum de arquivo");
        IO.println("3) Salvar álbum em arquivo");
        IO.println("4) Sair do programa");
        opcao = IO.readln("Informe a opção desejada: ");

        switch (opcao.charAt(0)) {
            case '1' -> {
                menuCriarAlbum();
            }
            case '2' -> IO.println("Você selecionou o carregamento de álbuns!");
            case '3' -> IO.println("Você selecionou o salvamento de álbuns!");
            case '4' -> IO.println("Você terminou o programa!");

            default -> IO.println("Opção inválida, selecione novamente a opção desejada!");
        }
        IO.println("\n\n\n\n\n\n\n\n\n\n\n\n");

    } while(opcao.charAt(0) != '4');

}