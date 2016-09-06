/**
 * Created by ramon on 05/09/16.
 */
public class testaValida {
    public static void main(String[] args) {

        Validacao v = new Validacao();
        System.out.println("Questao 1");
        System.out.println(v.tamanhoString("Ramon"));
        System.out.println("Questao 2");
        v.tamanhoString2("Ramon");

        System.out.println("Questao 8");
        System.out.println(v.qtdVogais("ramon"));
        System.out.println("Questao 9");
        System.out.println(v.qtdConsoantes("ramon"));
        System.out.println("Questao 10");
        System.out.println(v.qtdEspecial("ramon?"));

        System.out.println("Questao 7");
        System.out.println(v.ordenAsc("Zuleica", "Bruna"));

        Teclado tc = new Teclado();
        tc.charSN();
        tc.lerInt();

    }
}
