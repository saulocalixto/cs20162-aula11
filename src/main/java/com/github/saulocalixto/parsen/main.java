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
     * Captura uma expressão passada pelo usuário e envia ao parsen para ser
     * resolvida.
     * 
     * @param args Expressão que o usuário irá informar para ser feito o cálcu
     * lo.
     */
    public static void main(final String[] args) {
        
        if(args[0].length() > 0) {
            try {
                Calcular calculo = new Calcular();
                System.out.println(calculo.calcularExpressao(args[0]));
                System.exit(0);
            } catch (IllegalArgumentException erro) {
                System.err.println("Expressão inválida: " + erro.getMessage());
                erro("Expressão inválida");
            }
        } else {
            erro("Argumento nulo");
        }
        
        System.exit(0);
    }
    
    /**
     * Retorna saída do programa com Syste.exit(1) para representar erro de
     * execução.
     * @param err Mensagem de erro que será exibida para o usuário.
     */
    public static void erro(final String err) {
        System.out.println(err);
        System.exit(1);
    }
}
