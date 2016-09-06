import java.util.Scanner;

/**
 * Created by ramon on 05/09/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Funcionario[] vetor = new Funcionario[10];
        int cont=0;
        int op=0;

        do{
            System.out.println("1- Add um funcionario");
            op=tc.nextInt();
            switch (op){
                case 1:{
                    Funcionario f= new Funcionario();
                    cont=f.add(vetor,cont);
                    break;
                }
                case 2:{

                    Funcionario.listar(vetor,cont);
                    break;

                }

            }

            System.out.println("Funcionario cadastrados " + cont);
        }while (op!=99);
        ///case 1


    }
}
