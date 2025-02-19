import java.sql.Date;

public class Operadores {
    public static void main(String[] args) {

        double soma = 10.5 + 15.7;
        int subtração = 113 - 5;
        int multiplicação = 20 * 7;
        int divisão = 15/3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);




        int numero1 = 1;
        numero1++;
        System.out.println(numero1);

        int numero2 = 2;
        System.out.println(++numero2); 





    }
}
