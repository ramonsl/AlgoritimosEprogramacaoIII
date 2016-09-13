import java.util.ArrayList;

/**
 * Created by ramon on 12/09/16.
 */
public class BibliotecaList {



    public static void main(String[] args) {
        ArrayList<Livro> minhaBiblioteca = new ArrayList<>();
        Livro l= new Livro();
        l.ler();

        minhaBiblioteca.add(l);
        minhaBiblioteca.add(0,l);
        minhaBiblioteca.size();
        minhaBiblioteca.isEmpty();
        minhaBiblioteca.get(0).mostrar();
        minhaBiblioteca.remove(0);
        minhaBiblioteca.remove(l);

        Livro a= new Livro();
        l.equals(a);
        minhaBiblioteca.contains(a);

        for(int i =0; i<minhaBiblioteca.size();i++){
            Livro li = minhaBiblioteca.get(i);
            li.mostrar();
        }

        for (Livro li:minhaBiblioteca) {
            li.mostrar();
        }

       // a.atualizaNome();
        minhaBiblioteca.set(0,a);
        minhaBiblioteca.indexOf(a);
      //  minhaBiblioteca.ensureCapacity(45);




    }
}
