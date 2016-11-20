/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

/**
 * @author Saulo de Araújo Calixto
 */
public class Executavel {

    /**
     *
     * @param args Expressão que o usuário irá informar para ser feito o cálcu
     * lo.
     */
    public static void main(final String[] args) {

        String conta;
        try {
            conta = args[0];
            Calcular.calcularExpressao(conta);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.err.println("Expressão nula.");
            System.exit(1);
        }
    }
}
