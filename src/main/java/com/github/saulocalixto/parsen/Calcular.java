/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.parsen;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;

/**
 *
 * @author saulocalixto
 */
public class Calcular {

    public static double calcularExpressao(String expressao) {

        Lexer calcula = new Lexer(expressao);
        Parser processador = new Parser(calcula.tokenize());
        return (processador.expressao().valor());

    }

}
