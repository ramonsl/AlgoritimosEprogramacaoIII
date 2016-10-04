import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ramon on 03/10/16.
 */
public class Playlist {

    int vet[] = new int[10]; /// declarando um vetor n.
    int[] vet2 = new int[10];

    public ArrayList<Musica>  minhasMusicas = new ArrayList<>();
    public int p; // armazena o indice da ultima musica tocada

    public void play(){
        if (minhasMusicas.isEmpty()){
            System.out.println("Opa não temos musicas cadastrada, Cadastre uma");
        }else{
                if (p < minhasMusicas.size()){
                    minhasMusicas.get(p).mostrar();
                    p++;
                }else{
                    System.out.println("Não há mais musicas");
                    p=0;
                }
        }

    }

    public void random(){
        Random r = new Random();
        p= r.nextInt(minhasMusicas.size());

    }

    public void add(Musica m){
         if(minhasMusicas.contains(m)){
             System.out.println("Essa musica ja esta cadastrada");
         }else{
             minhasMusicas.add(m);
             System.out.println("Musica cadastrada");
         }
    }

    public void add(){
        Musica m = new Musica();
        m.ler();
        if(minhasMusicas.contains(m)){
            System.out.println("Essa musica ja esta cadastrada");
        }else{
            minhasMusicas.add(m);
            System.out.println("Musica cadastrada");
        }
    }

    public Musica remover(){
       // String titulo = new String(); nao funciona
        Scanner tc = new Scanner(System.in);
        Musica busca = new Musica();
        System.out.println("Digite o titulo da musica");
        busca.titulo = tc.next();
        int posicao=minhasMusicas.indexOf(busca);
        if (posicao>=0){

            System.out.println("Removido");
            return minhasMusicas.remove(posicao);
        }else{
            System.out.println("Não encontrada");
            return null;
        }
     }
    public void removerPelaMusica(){
        // String titulo = new String(); nao funciona
        Scanner tc = new Scanner(System.in);
        Musica busca = new Musica();
        System.out.println("Digite o titulo da musica ");
        busca.titulo = tc.next();
        if (minhasMusicas.remove(busca)){
            System.out.println("Removido");

        }else{
            System.out.println("Não encontrada ");

        }
    }
/*
* Outros métodos que são imporntantes estudar no arrayList
* Add(E)
* Add(int i, E )
* remove(E)
* remove(int i)
* get(int i)
* indexOf(int i)
* contains(Obj)
* isEmpty
* size
* Classe String...
*https://docs.oracle.com/javase/8/docs/api/
*
* Conteudos a estudar
* Classes
* Atributos
* Metodos
* ArrayList
* Voces vao fazer um exercicio igual ao do canil.!!!!!!!!
*
* */

}
