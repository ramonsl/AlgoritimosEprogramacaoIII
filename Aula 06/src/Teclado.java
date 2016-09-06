import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by ramon on 05/09/16.
 *
  Ao longo das atividades, utilizamos constantemente a classe Scanner, para realizar os inputs de dados. Entretanto podemos aprimorar os métodos padrões criando métodos mais precisos para nossas necessidades.
 Para isso vamos criar uma classe Input, que ira realizar alguns métodos mais específicos para nossas necessidades.
 1-	Um método que leia, valide e retorne um char “s” ou “n” ;
 2-	Um método que leia, valide e retorne um inteiro
 3-	Um método que leia, valide e retorne um double
 4-	Um método que leia, valide e retorne um float
 5-	Um método que leia, valide e retorne uma string
 6-	Um método que leia, valide e retorne uma String que possuam mais de 3 caracteres
 7-	Um método que leia, valide e retorne uma String que possuam mais de um número especificado de caracteres
 8-	Um método que leia, valide e retorne uma String que possua uma @;
 9-	Um método que leia, valide e retorne uma String que possua um caracter passado por parâmetro.
 10-	Um método que leia, valide e retorne um inteiro entre dois valores informado por argumento.

 */
public class Teclado {
Scanner tc = new Scanner(System.in);
    //1-	Um método que leia, valide e retorne um char “s” ou “n” ;
public char charSN(){
    char a;
    do{
        System.out.println("Digite S ou N");
         a= tc.next().toLowerCase().charAt(0);
    }while (a!='s' && a!='n');
    return a;

}
public int lerInt(){
    //2-	Um método que leia, valide e retorne um inteiro
    String a;

    int digito=0;
   // a.matches("ˆ[0-9]*$"); // espressao regular pra validar um digito
    int cont=0;
    do{
        System.out.println("Digite um inteiro");
           a = tc.next();
        for(int i=0;i<a.length();i++){
       if (!Character.isDigit(a.charAt(i))){
          cont++;
       }
    }

    if(cont ==0){
        digito = Integer.valueOf(a);
        Integer.parseInt(a);
    }
    }while (cont!=0);
    return digito;



}

}
