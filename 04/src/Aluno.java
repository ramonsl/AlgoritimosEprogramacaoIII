import java.util.Scanner;

/**
 * Created by ramon on 22/08/16.
 */
public class Aluno {
/*
    Implemente uma classe chamada Aluno para definir
    os objetos que representarão os alunos de uma escola.
    Essa classe deve declarar três atributos:
    o primeiro para o nome,
    o segundo para o CPF e o
    terceiro para a data de nascimento dos alunos.*/

    public String nome;
    public String CPF;
    public String nasc;

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite nome:");
        this.nome=tc.next();
        System.out.println("Digite CPF:");
        this.CPF=tc.next();
        System.out.println("Digite nascimento:");
        this.nasc=tc.next();


    }

}
