import java.util.Scanner;

public class Musica {
    public String titulo;   ///atributos
    public String artista;
    public String duracao;
    public String genero;


    public void ler(){   ///metodos
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o Titulo da Musica");
        titulo = tc.next();
        System.out.println("Digite o Artista da Musica");
        artista = tc.next();
        System.out.println("Digite o Duração da Musica");
        duracao = tc.next();
        System.out.println("Digite o Genero da Musica");
        genero = tc.next();

    }
    public void mostrar(){
        System.out.println(" Titulo da Musica "+ titulo);
        System.out.println(" Artista da Musica " + artista);
        System.out.println(" Duração da Musica "+duracao );
        System.out.println(" Genero da Musica "+ genero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Musica musica = (Musica) o;

        return titulo != null ? titulo.equals(musica.titulo) : musica.titulo == null;

    }

}
