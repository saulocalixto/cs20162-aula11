/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;

/**
 * @author saulocalixto
 */
public class Calcular {

    /**
     * @param expressao Expressão matemática que o usuário informa para obter
     * o resultado.
     * Método pega a expressão informada pelo usuário, verifica se é uma expres-
     * sao válida e então chama a classe Parser para obter o resultado.
     * Caso tudo ocorra como esperado retorna System.exit(0), caso contrário,
     * retorna System.exit(1).
     */
    public static void calcularExpressao(final String expressao) {

        if (expressao != null) {
            Lexer calcula = new Lexer(expressao);
            Parser processador = new Parser(calcula.tokenize());
            try {
                System.out.println(processador.expressao().valor());
                System.exit(0);
            } catch (IllegalArgumentException erro) {
                System.err.println("Expressão inválida.");
                System.exit(1);
            }
        } else {
            System.err.println("Erro, expressão nula.");
            System.exit(1);
        }
    }
}
