/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

/**
 * @author Saulo de Araújo Calixto
 */
public class main {

    /**
     *
     * @param args Expressão que o usuário irá informar para ser feito o cálcu
     * lo.
     */
    public static void main(final String[] args) {

        if(args[0] != null) {
            String conta;
            conta = args[0];
            systemExit resultado = new systemExit();
            resultado.Saida(conta);
        } else {
            System.out.println("Expressão nula");
            System.exit(1);
        }
    }
}
