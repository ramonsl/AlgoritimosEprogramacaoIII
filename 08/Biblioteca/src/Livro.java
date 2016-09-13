import java.util.Scanner;

/**
 * Created by ramon on 12/09/16.
 */
public class Livro {
    String titulo;
    int nPag;
    int nExemplares;
    Editora editora;
    Autor autor;


    public void ler (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite titulo");
        this.titulo=sc.next();
        System.out.println("Digite nPag");
        this.nPag=sc.nextInt();
        System.out.println("Digite Exemplares");
        this.nExemplares=sc.nextInt();
        Autor a = new Autor();
        a.ler();
        this.autor=a;
    //  this.autor = new Autor();
        this.editora = new Editora(); // forma - gambi
        this.editora.ler();
    }
    public void mostrar(){
        System.out.println("Titulo " + this.titulo);
        System.out.println("Numero de paginas "+this.nPag);
        System.out.println("Numero de exemplares "+this.nExemplares);
        ///outros atributos
        this.autor.mostrar();

        this.editora.mostrar();



    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        return titulo != null ? titulo.equals(livro.titulo) : livro.titulo == null;

    }

    @Override
    public int hashCode() {
        return titulo != null ? titulo.hashCode() : 0;
    }
}
