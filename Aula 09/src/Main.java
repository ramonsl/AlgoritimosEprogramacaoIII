import java.util.Scanner;

/**
 * Created by ramon on 03/10/16.
 */
public class Main {
    public static void main(String[] args) {
        Playlist listaDeMusicas = new Playlist();
        Scanner tc = new Scanner(System.in);
        int op=99;
        do{
            System.out.println("1 - Adicionar ");
            System.out.println("2 - Remover");
            System.out.println("3 - Tocar ");
            System.out.println("4 - Randomizar uma musica");
            op = tc.nextInt();

            switch (op){
                case 1:{
                    listaDeMusicas.add();
                    break;
                }
                case 2:{
                    listaDeMusicas.remover();
                    break;
                }
                case 3:{
                    listaDeMusicas.play();
                    break;
                }
                case 4:{
                    listaDeMusicas.random();
                    listaDeMusicas.play();
                }
            }

        }while (op!=99);



    }
}
