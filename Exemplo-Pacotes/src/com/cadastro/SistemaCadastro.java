package com.cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "111.111.111-11");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
