import java.util.Scanner;

/**
 * Created by ramon on 12/09/16.
 */
public class Autor {
    String nome;
    String email;

    public void ler(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nome");
        this.nome=sc.next();
        System.out.println("Digite email");
        this.email=sc.next();

    }

    public void mostrar() {
        System.out.println("Nome do autor" + this.nome);
        System.out.println("Email do autor" + this.email);
    }


}
