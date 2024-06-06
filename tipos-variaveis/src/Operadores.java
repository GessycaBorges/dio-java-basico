public class Operadores {
    public static void main(String[] args) {
        /*
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        */

        // Unários
        /*
        int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        System.out.println(++numero);
        System.out.println(--numero);


        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);

        //Ternário
        int a, b;

        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "false";

        System.out.println(resultado);

         */
        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
        System.out.println("num1 é igual a num2? " + simNao);

        simNao = num1 != num2;
        System.out.println("num1 é diferente de num2? " + simNao);

        simNao = num1 > num2;
        System.out.println("num1 é maior que num2? " + simNao);

        String nomeUm = "Gessyca";
        String nomeDois = new String("Gessyca");
        System.out.println(nomeUm.equals(nomeDois));
    }
}