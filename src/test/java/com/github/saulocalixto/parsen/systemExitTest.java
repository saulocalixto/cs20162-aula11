/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.parsen;


import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;


/**
 *
 * @author saulocalixto
 */
public class systemExitTest {
    
    systemExit saida;

    @Before
    public void executaAntes() {
        saida = new systemExit();
    }
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void saidaCerta() {
        exit.expectSystemExitWithStatus(0);
        String expressao;
        expressao = "15*7";
        systemExit.Saida(expressao);
    }
    
    @Test
    public void Invalido() {
        exit.expectSystemExitWithStatus(1);
        String expressao;
        expressao = "5++--";
        saida.Saida(expressao);
    }
    
}
