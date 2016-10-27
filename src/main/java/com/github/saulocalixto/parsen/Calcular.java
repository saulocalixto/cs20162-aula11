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

    public static void main(String[] args) {


        if(args[0] != null) {
            Lexer calcula = new Lexer(args[0]);
            Parser processador = new Parser(calcula.tokenize());
            System.out.println(processador.expressao().valor());
        }

    }

}
