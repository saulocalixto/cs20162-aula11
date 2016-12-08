/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;

public class Calcular {

    /**
     * Captura expressão passada pelo usuário e o parsen retorna o resultado.
     *
     * @param expressao Expressão matemática que o usuário informa para obter o
     * resultado. Método pega a expressão informada pelo usuário, verifica se é
     * uma expres- sao válida e então chama a classe Parser para obter o
     * resultado. Caso tudo ocorra como esperado retorna 0, caso contrário,
     * retorna 1.
     *
     * @return retorna o resultado da expressão passada pelo usuário.
     */
    public static float calcularExpressao(final String expressao) {
        try {
            Lexer calcula = new Lexer(expressao);
            Parser processador = new Parser(calcula.tokenize());
            return processador.expressao().valor();
        } catch (IllegalArgumentException erro) {
            throw new IllegalArgumentException();
        }
    }
}
