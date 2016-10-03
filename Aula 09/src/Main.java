/**
 * Created by ramon on 03/10/16.
 */
public class Main {
    public static void main(String[] args) {
        Playlist listaDeMusicas = new Playlist();

        ////// CRIAR UM MENU MANEIRO

        ////chamando o metodo play
        listaDeMusicas.play();

        ///// Adicionar uma musica
        listaDeMusicas.add();


        ////chamando o metodo play
        listaDeMusicas.play();

         listaDeMusicas.removerPelaMusica();
        //chamando o remover e mostrando a musica
        Musica m =listaDeMusicas.remover();
        if(m!=null){
            m.mostrar();
        }


    }
}
