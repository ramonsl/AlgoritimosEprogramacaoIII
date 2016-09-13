/**
 * Created by ramon on 12/09/16.
 */
public class Biblioteca {
    public static int cont=0;
    public static Livro[] livros= new Livro[100];

    public void add(){
        Livro meuLivro= new Livro();
        meuLivro.ler();
        livros[cont]=meuLivro;
        cont++;
    }


}
