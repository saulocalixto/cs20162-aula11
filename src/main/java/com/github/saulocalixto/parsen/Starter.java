/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

/**
 * @author Saulo de Araújo Calixto
 */
public class Starter {

    /**
     * Captura uma expressão passada pelo usuário e envia ao parsen para ser
     * resolvida.
     *
     * @param args Expressão que o usuário irá informar para ser feito o cálcu
     * lo.
     */
    public static void main(final String[] args) {
        int saida = 0;
        try {
            System.out.println(Calcular.calcularExpressao(args[0]));
        } catch (IllegalArgumentException
                | ArrayIndexOutOfBoundsException erro) {
            System.err.println("Expressão inválida:" + erro.getMessage());
            saida = 1;
        }

        System.exit(saida);
    }
}
