import java.util.Scanner;
import java.util.jar.Pack200;

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
            System.out.println(vetor[i].salario);
        }
    }
    public int remover(Funcionario vetor[], int qtd){
        Scanner tc = new Scanner(System.in);
        String busca = tc.next();
        int rem=-1;
        for (int i=0;i<qtd; i++) {
            if(busca.equalsIgnoreCase(vetor[i].nome)){
                rem=i;
            }
        }
        if(rem==-1){
            System.out.printf("Não encontrado");
            return qtd;
        }else{
            for(int i=rem;rem<qtd;rem++){
                vetor[rem]= vetor[rem+1];
            }
            qtd--;
            return qtd;
        }



    }


}
