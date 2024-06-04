public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de recuperação");

        else
            System.out.println("Reprovado");

        // Cenário 1
        String resultado1 = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println("Cenário 1 ternário: " + resultado1);


        // Cenário 2
        String resultado2 = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println("Cenário 2 ternário: " + resultado2);
    }
}
