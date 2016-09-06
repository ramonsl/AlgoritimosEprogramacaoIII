/**
 * Created by ramon on 05/09/16.
 * 1 – Elabore um método que retorne o tamanho da String passada por parâmetro.
 2 - Elabore um método que mostre o   tamanho da String passada por parâmetro.
 3 -  Elabore um método que receba duas strings passada por parâmetro concatene as duas e mostre a String concatenada e retorne o tamanho da String.
 4 – Elabore um método que receba dois int e retorne a soma dos dois números.
 5 – Elabore um método que receba dois int e retorne o maior valor;
 6 – Elabore um método que receba duas Strings e retorne a string menor, se igual retorna a palavra igual;
 7 – Elabore um método que receba duas Strings e retorne a string que vem primeiro na ordem alfabética, se igual retorna a palavra igual;
 8 – Elabore um método que receba uma Strings e retorne a numero de vogais;
 9 – Elabore um método que receba uma Strings e retorne a numero de consoantes;
 10 – Elabore um método que receba uma Strings e retorne a numero de caracteres especiais;

 */
public class Validacao {
//     1 – Elabore um método que retorne o tamanho da String passada por parâmetro.

    public int tamanhoString(String s){
       // int a= s.length();
        return s.length();
    }
 //2 - Elabore um método que mostre o
    // tamanho da String passada por parâmetro.
public void tamanhoString2(String s){
    System.out.println(s.length());
    ///ou
    //System.out.println(tamanhoString(s));

}
// 3 -  Elabore um método que receba duas strings
// passada por parâmetro concatene as duas e
// mostre a String concatenada e retorne o tamanho da String.
    public int concatenaString(String a, String b){
        a.concat(b);
        System.out.println(a);
        return tamanhoString(a);
    }

 //    4 – Elabore um método que receba dois int e
    // retorne a soma dos dois números.
    public  int soma(int a, int b){
        return a+b;

    }

   //  5 – Elabore um método que receba dois int e
    // retorne o maior valor;

    public int maiorValor(int a, int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }

//6 – Elabore um método que receba
// duas Strings e retorne a string menor,
// se igual retorna a palavra igual;
    public String menorString(String a, String b){
       if ( a.length()> b.length()) {
           return b;
        }else if(b.length() == a.length()){
            return "igual";
        }else {
            return a;
       }
    }


 //7 Elabore um método que receba duas
    // Strings e retorne a string que vem
    // primeiro na ordem alfabética,
    // se igual retorna a palavra igual;
    public String ordenAsc(String a, String b){
        if (a.compareTo(b) == 0){
            return "igual";
        }
        if (a.compareTo(b)<0){
             return a;
        }else{
            return b;
        }
    }

// 8 – Elabore um método que receba uma
// Strings e retorne a numero de vogais;
public  int qtdVogais(String palavra){
    int cont=0;
    for (int i=0;i< palavra.length();i++){
        if(palavra.charAt(i)=='a' || palavra.charAt(i)=='e' || palavra.charAt(i)=='i' || palavra.charAt(i)=='o' || palavra.charAt(i)=='u' ){
            cont++;
        }
    }
    return cont;
}
//9 – Elabore um método que receba uma
// Strings e retorne a numero de consoantes;

public int qtdConsoantes(String palavra){
int tamanho =palavra.length();
    palavra=palavra.replaceAll("[bcdfghjlmnpqrstvxz]", "");
        int tamSemConsoante =palavra.length();
      return tamanho -tamSemConsoante;
}
//10 – Elabore um método que
// receba uma Strings e retorne a
// numero de caracteres especiais;
public int qtdEspecial(String palavra){
    return palavra.length()-qtdVogais(palavra)- qtdConsoantes(palavra);
}
}
