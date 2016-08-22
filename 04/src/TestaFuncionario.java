/**
 * Created by ramon on 22/08/16.
 *
 * Faça uma classe chamada TestaAluno
 * e crie dois objetos da classe Aluno atribuindo valores a eles.
 * A classe também deve mostrar na tela as informações desses objetos.
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario objA = new Funcionario();
        Funcionario objB = new Funcionario();

        objA.nome = "Ramon";
        objA.CPF = "00659422050";
        objA.salario=10000;
        objB.nome = "Ramon 2";
        objB.CPF = "00659422050";
        objB.salario=100;


        System.out.println("Nome:"+ objA.nome);
        System.out.println("CPF:"+ objA.CPF);
        System.out.println("Salario:"+ objA.salario);
        System.out.println("Nome:"+ objB.nome);
        System.out.println("CPF:"+ objB.CPF);
        System.out.println("Salario:"+ objB.salario);

    }
}
