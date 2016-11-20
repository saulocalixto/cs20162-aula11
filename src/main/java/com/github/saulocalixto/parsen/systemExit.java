/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

/**
 *
 * @author saulocalixto
 */
public class systemExit {

    public static void Saida(String expressao) {

        try {
            Calcular calculo = new Calcular();
            System.out.println(calculo.calcularExpressao(expressao));
            System.exit(0);
        } catch (IllegalArgumentException erro) {
            System.err.println("Expressão inválida: " + erro.getMessage());
            System.exit(1);
        }
    }

}
