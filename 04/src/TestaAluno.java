/**
 * Created by ramon on 22/08/16.
 *
 * Faça uma classe chamada TestaAluno
 * e crie dois objetos da classe Aluno atribuindo valores a eles.
 * A classe também deve mostrar na tela as informações desses objetos.
 */
public class TestaAluno {

    public static void main(String[] args) {
        Aluno objA = new Aluno();
        Aluno objB = new Aluno();

        objA.ler();
        objB.ler();



        System.out.println("Nome:"+ objA.nome);
        System.out.println("CPF:"+ objA.CPF);
        System.out.println("Data Nascimento:"+ objA.nasc);

        System.out.println("Nome:"+ objB.nome);
        System.out.println("CPF:"+ objB.CPF);
        System.out.println("Data Nascimento:"+ objB.nasc);

    }
}
