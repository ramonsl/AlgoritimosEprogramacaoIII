import java.util.Scanner;

/**
 * Created by ramon on 05/09/16.
 */
public class Funcionario {
    public String nome;
    public String departamento;
    public double salario;
    public  int idade;

    public  int add(Funcionario vetor[], int qtd){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite departamento");
        this.departamento =tc.next();
        System.out.println("Digite Nome");
        this.nome= tc.nextLine();
       this.nome= tc.next();
        System.out.println("Digite idade");
        this.idade = tc.nextInt();
        System.out.println("Digite o salario");
        this.salario= tc.nextDouble();
        vetor[qtd]=this;
        qtd++;
        return qtd;
    }

    public static void listar(Funcionario vetor[], int qtd){
        for(int i=0;i<qtd;i++){
            System.out.println(vetor[i].nome);
        }
    }


}
