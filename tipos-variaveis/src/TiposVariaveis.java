public class TiposVariaveis {
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        System.out.print(numero);

        numero = 10;
        System.out.print(numero);

        //Não pode mudar
        final double VALOR_DE_PI = 3.14;
        //    VALOR_DE_PI = 10; -  NÃO PODE
    }
}