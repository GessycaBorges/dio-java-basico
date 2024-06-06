package Cep;

import java.util.Locale;
import java.util.Scanner;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu cep");
            String cep = scanner.next();

            String cepFormatado = formatarCep(cep);
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e){
            System.out.println("O cep não corresponde com as regras de negócio.");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        String cepFormatado = String.format("%s.%s-%s",
                cep.substring(0, 2),
                cep.substring(2, 5),
                cep.substring(5, 8));

        return cepFormatado;
    }
}
